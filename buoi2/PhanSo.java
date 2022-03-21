package buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tu, mau;

	public PhanSo() {
		tu = 0;
		mau = 1;
	}

	public PhanSo(int x, int y) {
		tu = x;
		mau = y;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap tu so:");
			tu = sc.nextInt();
			System.out.print("Nhap mau so:");
			mau = sc.nextInt();
			if (mau == 0)
				System.out.println("Nhap sai, hay nhap lai");
		} while (mau == 0);
	}

	public void hienThi() {
		String pso = new String();
		if (tu == 0)
			pso += 0;
		else if (mau == 1)
			pso += tu;
		else
			pso = tu + "/" + mau;
		System.out.println(pso);
	}

	public void nghichDao() {
		int t = tu;
		tu = mau;
		mau = t;
	}

	public PhanSo giaTriNghichDao() {
		PhanSo nghich = new PhanSo();
		nghich.tu = mau;
		nghich.mau = tu;
		return nghich;
	}

	public float giaTriThuc() {
		float kq = (float) tu / mau;
		return kq;
	}

	public boolean lonHon(PhanSo a) {
		if (giaTriThuc() > a.giaTriThuc())
			return true;
		return false;
	}
	//pso + pso
	public PhanSo cong(PhanSo b) {
		PhanSo tong = new PhanSo();
		if (mau == b.mau) {
			tong.tu = tu + b.tu;
			tong.mau = mau;
		} else {
			tong.tu = tu * b.mau + mau * b.tu;
			tong.mau = mau * b.mau;
		}
		return tong;
	}
	//pso + num
	public PhanSo cong(int num) {
		PhanSo n = new PhanSo();
		n.tu = num * mau;
		n.mau = mau;
		return cong(n);
	}
	
	public PhanSo tru(PhanSo b) {
		PhanSo tong = new PhanSo();
		if (mau == b.mau) {
			tong.tu = tu - b.tu;
			tong.mau = mau;
		} else {
			tong.tu = tu * b.mau - mau * b.tu;
			tong.mau = mau * b.mau;
		}
		return tong;
	}
	
	public PhanSo tru(int num) {
		PhanSo n = new PhanSo();
		n.tu = num * mau;
		n.mau = mau;
		return tru(n);
	}
	
	public PhanSo toiGianPhanSo() {
		int ucln = 0;
		PhanSo t = new PhanSo(tu, mau);
		if(giaTriThuc() == 0) return t;
		do {
			if(t.tu == t.mau) ucln = t.tu;
			else if(t.tu > t.mau) {
				t.tu = t.tu - t.mau;
			}else t.mau = t.mau - t.tu;
		}while (ucln == 0);
		PhanSo kq = new PhanSo(tu/ucln, mau/ucln);
		return kq;
	}
}