package buoi4;

import java.util.Scanner;

public class baitap6 {

	public static void main(String[] args) {
		// Đầu vào
		Scanner scan = new Scanner(System.in);
		int n=1;
		int so_ngau_nhien = (int) (Math.random() * 999 + 1);
		// Xử lý
		while (n!=so_ngau_nhien) {
			System.out.println("Mời bạn nhập 1 số: ");
			n = Integer.parseInt(scan.nextLine());
			if (n > so_ngau_nhien) {
				System.out.println("Bạn đang nhập 1 số lớn hơn số bí mật");
				System.out.println("Bạn cần phải nhập nhỏ hơn: " + (n - so_ngau_nhien) + " để tìm ra số bí mật");
			} else if (n < so_ngau_nhien) {
				System.out.println("Bạn đang nhập 1 số nhỏ hơn số bí mật");
				System.out.println("Bạn cần phải nhập lớn hơn: " + (so_ngau_nhien - n) + " để tìm ra số bí mật");
			} else
				System.out.println("kết thúc game. Số bí mật là: "+so_ngau_nhien);
			
		}

		// Đầu ra

	}

}
