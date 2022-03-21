package buoi2;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;

	public Date() {
		ngay = 23;
		thang = 2;
		nam = 2022;
	}

	public Date(int d, int m, int y) {
		ngay = d;
		thang = m;
		nam = y;
	}

	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay =");
			ngay = sc.nextInt();
			System.out.println("Nhap thang =");
			thang = sc.nextInt();
			System.out.println("Nhap nam =");
			nam = sc.nextInt();

		} while (!hopLe());
	}

	public void hienThi() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}

	public String toString() {
		return (ngay + "/" + thang + "/" + nam);
	}

	public boolean hopLe() {
		// 0 1 2 3 4 5 6 7 8 9 10 11 12
		int max[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (nam % 4 == 0)
			max[2] = 29;
		if (nam > 0 && thang <= 12 && thang >= 1 && ngay >= 1 && ngay <= max[thang]) {
			return true;
		}
		return false;
	}

	public Date ngayHomSau() {
		Date tmr = new Date(ngay, thang, nam);
		tmr.ngay++;
		if (!tmr.hopLe()) {
			tmr.ngay = 1;
			tmr.thang++;
			if (!tmr.hopLe()) {
				tmr.thang = 1;
				tmr.nam++;
			}
		}
		return tmr;
	}

	public Date congNgay(int n) {
		Date kq = new Date(ngay, thang, nam);
		for (int i = 0; i < n; i++) {
			kq = kq.ngayHomSau();
		}
		return kq;
	}
}