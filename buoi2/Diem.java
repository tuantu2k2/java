package buoi2;

import java.util.Scanner;

public class Diem {
	private int x, y;

	public Diem() {
		x = 0;
		y = 0;
	}

	public Diem(int x1, int y1) {
		x = x1;
		y = y1;
	}

	public Diem(Diem d) {
		x = d.x;
		y = d.y;
	}

	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap x = ");
		x = sc.nextInt();
		System.out.print("Nhap y = ");
		y = sc.nextInt();
	}

	public void hienThi() {
		System.out.println("(" + x + ", " + y + ")");
	}

	public void hienThi(String s) {
		System.out.println(s);
		hienThi();
	}

	public String toString() {
		return ("(" + x + ", " + y + ")");
	}

	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public int giaTriX() {
		return x;
	}

	public int giaTriY() {
		return y;
	}

	public float khoangCach() {
		float kq = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return kq;
	}

	public float khoangCach(Diem d) {
		float kq = (float) Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
		return kq;
	}

}