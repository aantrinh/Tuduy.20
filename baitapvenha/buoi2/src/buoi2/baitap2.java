package buoi2;

import java.util.Scanner;

public class baitap2 {

	public static void main(String[] args) {
		// Đầu vào
		float a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("MỜI BẠN NHẬP VÀO 3 SỐ THỰC");
		System.out.print("Số thứ nhất là: ");
		a = scan.nextFloat();
		System.out.print("Số thứ hai là: ");
		b = scan.nextFloat();
		System.out.print("Số thứ ba là: ");
		c = scan.nextFloat();
		// Xử lý
		System.out.println("Kết quả cuối cùng là: ");
		if (a < 0) {
			System.out.println(-a);
		} else {
			System.out.println(a);
		}
		if (b < 0) {
			System.out.println(-b);
		} else {
			System.out.println(b);
		}
		if (c < 0) {
			System.out.println(-c);
		} else {
			System.out.println(c);
		}

	}

}
