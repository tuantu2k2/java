package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
	private String mssv, hten;
	private Date ngaySinh;
	private int soHP;
	private String[] tenHP, diem;

	public SinhVien() {
		mssv = new String();
		hten = new String();
		ngaySinh = new Date();
		soHP = 0;
		tenHP = new String[55];
		diem = new String[55];
	}

	public SinhVien(int m) {
		mssv = new String();
		hten = new String();
		ngaySinh = new Date();
		soHP = 0;
		tenHP = new String[m];
		diem = new String[m];
	}

	public SinhVien(SinhVien sv) {
		mssv = new String(sv.mssv);
		hten = new String(sv.hten);
		ngaySinh = new Date(sv.ngaySinh);
		soHP = sv.soHP;
		tenHP = new String[sv.tenHP.length];
		diem = new String[sv.diem.length];
		for (int i = 0; i < soHP; i++) {
			tenHP[i] = new String(sv.tenHP[i]);
			diem[i] = new String(sv.diem[i]);
		}
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ma so sv: ");
		mssv = sc.nextLine();
		System.out.print("\nNhap ho ten sv: ");
		hten = sc.nextLine();
		System.out.print("\nNhap ngay sinh: ");
		ngaySinh.nhap();
		System.out.print("\nNhap so mon: ");
		soHP = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < soHP; i++) {
			System.out.print("\nNhap mon hoc thu " + (i + 1) + ": ");
			tenHP[i] = sc.nextLine();
			System.out.print("\nNhap diem mon hoc thu " + (i + 1) + ": ");
			diem[i] = sc.nextLine();
		}
	}

	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < soHP; i++) {
			System.out.print("\nNhap diem mon hoc thu " + (i + 1) + ": ");
			diem[i] = sc.nextLine();
		}
	}

	public void in() {
		System.out.print("\n MSSV: " + mssv);
		System.out.print("\n Ho ten: " + hten);
		System.out.print("\n Ngay sinh: " + ngaySinh);
		System.out.print("\n So mon: " + soHP);
		for (int i = 0; i < soHP; i++) {
			System.out.print("\nMon hoc thu " + (i + 1) + ": " + tenHP[i]);
			System.out.print("\nDiem mon hoc thu " + (i + 1) + ": " + diem[i]);

		}

	}

	public String toString() {
		String s = "";
		s += ("\n MSSV:" + mssv);
		s += ("\n Ho ten:" + hten);
		s += ("\n Ngay sinh:" + ngaySinh);
		s += ("\n So mon:" + soHP);
		for (int i = 0; i < soHP; i++) {
			System.out.print("\nMon hoc thu " + (i + 1) + ": " + tenHP[i]);
			System.out.print("\nDiem mon hoc thu " + (i + 1) + ": " + diem[i]);
		}
		return s;
	}

	public float dtb() {
		float d = 0.0f;
		for (int i = 0; i < soHP; i++) {
			if (diem[i].equals("A"))
				d += 4;
			else if (diem[i].equals("B+"))
				d += 3.5;
			else if (diem[i].equals("B"))
				d += 3;
			else if (diem[i].equals("C+"))
				d += 2.5;
			else if (diem[i].equals("C"))
				d += 2;
			else if (diem[i].equals("D+"))
				d += 1.5;
			else if (diem[i].equals("D"))
				d += 1;
			else if (diem[i].equals("F"))
				d += 0;
		}
		return d / soHP;
	}

	public void them(String ten, String d) {
		if (soHP < tenHP.length - 1) {
			tenHP[soHP] = new String(ten);
			diem[soHP] = new String(d);
			soHP++;
		}
	}

	public void them(String ten) {
		if (soHP < tenHP.length - 1) {
			tenHP[soHP] = new String(ten);
			soHP++;
		}
	}

	public void xoa(String ten) {
		int i = 0;
		for (i = 0; i < soHP; i++)
			if (tenHP[i].equals(ten))
				break;
		// xoa mh tai vitri i
		if (i < soHP) {
			for (int j = i; j < soHP; j++) {
				tenHP[j] = tenHP[j + 1];
				diem[j] = diem[j + 1];
			}
			soHP--;
		}
	}

	public String layTen() {
		String ten = hten.trim();
		int k = ten.lastIndexOf(" ");
		return ten.substring(k);
	}
}
