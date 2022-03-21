package buoi2;

import java.util.Scanner;

public class SDPhanSo {
	public static void main(String agrs[]) {
		PhanSo a = new PhanSo(3, 7);
		System.out.print("Phan so a la: ");
		a.hienThi();

		PhanSo b = new PhanSo(4, 9);
		System.out.print("Phan so b la: ");
		b.hienThi();

		PhanSo x = new PhanSo(), y = new PhanSo();
		System.out.println("Nhap phan so x: ");
		x.nhap();

		System.out.println("Nhap phan so y: ");
		y.nhap();

		System.out.print("\nGia tri nghich dao cua x la ");
		x.giaTriNghichDao().hienThi();

		System.out.println("Tong x + y:");
		x.cong(y).toiGianPhanSo().hienThi();

		System.out.println("Tong x + 3:");
		x.cong(3).toiGianPhanSo().hienThi();

		System.out.println("Hieu x - y:");
		x.tru(y).toiGianPhanSo().hienThi();

		System.out.println("Hieu x - 3:");
		x.tru(3).toiGianPhanSo().hienThi();

		Scanner sc = new Scanner(System.in);
		System.out.println("So pso trong ds ");
		int n = sc.nextInt();
		PhanSo ds[] = new PhanSo[n];
		for (int i = 0; i < n; i++) {
			ds[i] = new PhanSo();
			System.out.println("Nhap pso thu " + (i + 1));
			ds[i].nhap();
		}
		// tong cac pso trong ds
		PhanSo tong = new PhanSo();
		for (int i = 0; i < n; i++) {
			tong = tong.cong(ds[i]);
		}
		System.out.println("Tong cac phan so trong ds la:");
		tong.toiGianPhanSo().hienThi();
		// phan so lon nhat
		PhanSo max = ds[0];
		for (int i = 1; i < n; i++) {
			if (ds[i].giaTriThuc() > max.giaTriThuc())
				max = ds[i];
		}
		System.out.println("Phan so lon nhat la: ");
		max.hienThi();
		// sx pso tang dan
		for (int i = 1; i < n; i++) {
			int j = i;
			while (j > 0 && ds[j].giaTriThuc() < ds[j - 1].giaTriThuc()) {
				PhanSo t = ds[j];
				ds[j] = ds[j - 1];
				ds[j - 1] = t;
				j--;
			}
		}
		System.out.println("Mang sau khi sx la");
		for (int i = 0; i < n; i++) {
			ds[i].hienThi();
		}
	}
}