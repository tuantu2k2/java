package buoi3;

import java.util.Scanner;

public class SDSinhVien {
	public static void main(String agrs[]) {
		SinhVien a = new SinhVien();
		a.nhap();
		a.them("LTHDT");
		a.in();

		// nhap ds sv
		System.out.print("\n\nNhap so sv");
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\nNhap sv thu " + (i + 1));
			ds[i] = new SinhVien();
			ds[i].nhap();
		}

		// ds sv canh bao hv
		System.out.print("\n\n------Ds sinh vien bi canh bao hoc vu: ----------------------------");
		for (int i = 0; i < n; i++) {
			if (ds[i].dtb() < 1)
				ds[i].in();
		}
		// sinh vien co diem tb cao nhat lop
		System.out.print("\n\n------Sinh vien co dtb cao nhat lop: ---------------------------");
		int max = 0;
		for (int i = 1; i < n; i++) {
			if (ds[i].dtb() > ds[max].dtb())
				max = i;
		}
		ds[max].in();
		// hien thi theo thu tu alphabet
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (ds[i].layTen().compareTo(ds[j].layTen()) > 0) {
					SinhVien s = new SinhVien(ds[i]);
					ds[i] = ds[j];
					ds[j] = s;
				}
			}
		}
		System.out.print("\n\n------DS sau khi sx theo alphabet la--------------------------------");
		for (int i = 0; i < n; i++) {
			System.out.print("\n\nsv thu " + (i + 1));
			ds[i].in();
		}
	}
}
