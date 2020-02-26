package buoi2;

import java.util.Scanner;

public class baitap8 {

	public static void main(String[] args) {
		// Đầu vào
		Scanner scan = new Scanner(System.in);
		String tenHang;
		Double so_luong, don_gia, thanh_tien;
		System.out.print("MỜI NHẬP TÊN SẢN PHẨM");
		tenHang = scan.nextLine();
		System.out.print("Số lượng là: ");
		so_luong = Double.parseDouble(scan.nextLine());
		System.out.print("Đơn giá: ");
		don_gia = Double.parseDouble(scan.nextLine());
		// Xử lý
		thanh_tien = so_luong * don_gia;
		if (so_luong >= 50 && so_luong <= 100) {
			thanh_tien = thanh_tien * (0.92);
		} else if (so_luong > 100) {
			thanh_tien = thanh_tien * (0.88);
		} else {
			thanh_tien = thanh_tien * 1;
		}
		// Đầu ra
		System.out.print("Thành tiền là: " + thanh_tien);
	}

}
