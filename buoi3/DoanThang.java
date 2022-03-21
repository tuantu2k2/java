package buoi3;

import buoi2.Diem;

public class DoanThang {
	private Diem d1, d2;

	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}

	public DoanThang(Diem d11, Diem d22) {
		d1 = new Diem(d11);
		d2 = new Diem(d22);
	}

	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}

	public DoanThang(DoanThang dt) {
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}

	public void nhap() {
		System.out.print("\nNhap toa do diem dau\n");
		d1.nhapDiem();
		System.out.print("\nNhap toa do diem cuoi\n");
		d2.nhapDiem();
	}

	public void in() {
		System.out.print("\n[" + d1 + ", " + d2 + "]");
	}

	public String toString() {
		return ("\n[" + d1 + ", " + d2 + "]");
	}

	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}

	public float doDai() {
		return d1.khoangCach(d2);
	}

}
