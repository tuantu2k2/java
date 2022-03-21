package buoi2;

public class SDDiem {
	public static void main(String agrs[]) {
		Diem A = new Diem(3, 4);
		System.out.println("Diem A la: ");
		A.hienThi();

		Diem B = new Diem();
		System.out.println("Nhap diem B");
		B.nhapDiem();

		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		C.hienThi("Toa do diem C la");
		// kcach tu B-> O
		System.out.println("Khoang cach tu B -> O la: " + B.khoangCach());
		// kcach tu A-> B
		System.out.println("Khoang cach tu A -> B la: " + A.khoangCach(B));

	}
}
