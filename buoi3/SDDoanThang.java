package buoi3;

import buoi2.Diem;

public class SDDoanThang {

	public static void main(String agrs[]) {
		Diem A = new Diem(2, 5);
		Diem B = new Diem(20, 35);

		DoanThang AB = new DoanThang(A, B);

		System.out.println("Tinh tien doanthang AB (5, 3)");
		AB.tinhTien(5, 3);
		AB.in();

		DoanThang CD = new DoanThang();
		System.out.print("\nNhap dthang CD");
		CD.nhap();
		System.out.format("Do dai doan thang CD = %.2f", CD.doDai());
	}

}
