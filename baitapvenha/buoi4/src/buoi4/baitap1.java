package buoi4;

import java.util.Scanner;

public class baitap1 {

	public static void main(String[] args) {
		// Đầu vào
		Scanner scan = new Scanner(System.in);
		int n = 0, sum = 0;
		// Xử lý
		do {
			n++;
			sum += n;

		} while (sum < 5000);
		System.out.println("Giá trị n nhỏ nhất là: " + n);
	}

}
