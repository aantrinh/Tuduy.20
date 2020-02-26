import java.util.Scanner;

/*
 * Mô tả: chương trình luyện tập mảng
 * người tạo: ân
 * ngày tạo: 6/8/2019
 * version: 1.0
 **/
public class luyentapmang {
	public static void NhapMang(float[] dtb, Scanner scan) {
		// tạo mảng
		System.out.print("Nhập điểm cho từng sinh viên");
		// Nhập mảng dữ liệu
		for (int i = 0; i < dtb.length; i++) {
			System.out.println("điểm trung bình [" + i + "]");
			dtb[i] = Float.parseFloat(scan.nextLine());
		}
	}

	public static void main(String[] args) {
		// Đầu vào
		Scanner scan = new Scanner(System.in);
		int SoSinhVien;
		System.out.println("Vui lòng nhập vào số sinh viên");
		SoSinhVien = Integer.parseInt(scan.nextLine());
		float[] dtb = new float[SoSinhVien];
		// Xử lý
		NhapMang(dtb, scan);
		// Đầu ra
		xuatMang(dtb);
	}

	public static void xuatMang(float[] dtb) {
		// cách 1
		// for (int i = 0; i < dtb.length; i++) {
		// System.out.println("điểm trung bình [" + i + "]" + dtb[i]);

		// }
		// cách 2: foreach
		for (float diem : dtb) {
			System.out.println(diem + "\t");
		}
	}
}
