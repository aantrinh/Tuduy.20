package buoi4;

import java.util.Scanner;

public class baitap3 {

	public static void main(String[] args) {
		// Đầu vào
		Scanner scan = new Scanner(System.in);
		int number = 1;
		int sum = 0;

		// Xử lý
		while (number != 0) {
			System.out.println("Mời nhập số: ");
			number = Integer.parseInt(scan.nextLine());
			if (number % 2 == 0) {
				sum += number;
			}
		}

		// Đầu ra
		System.out.println("Tổng cộng là: " + sum);

	}

}
