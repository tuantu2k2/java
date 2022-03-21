package buoi2;

import java.util.Scanner;

public class SDDate {
	public static void main(String agrs[]) {
		Date d1 = new Date(22, 2, 2022);
		d1.hienThi();

		Date d2 = new Date();
		System.out.println("Nhap ngay d2");
		d2.nhap();
		d2.hienThi();
		System.out.println("Ngay mai cua ngay d2");
		d2.ngayHomSau().hienThi();

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so ngay n cong them d2");
		int n = sc.nextInt();
		System.out.println(n + " ngay sau cua d2");
		d2.congNgay(n).hienThi();

	}
}