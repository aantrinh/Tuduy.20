package buoi4;

import java.util.Scanner;

public class baitap5 {
	public static int MENU(Scanner scan) {
		int nhap;
		do {
			System.out.println("MENU");
			System.out.println("1. Tổng");
			System.out.println("2. Hiệu");
			System.out.println("3. Tích");
			System.out.println("4. Thương");
			System.out.print(" Mời lựa chọn số>>>>>>");
			nhap = Integer.parseInt(scan.nextLine());
		} while (nhap < 0 || nhap > 4);
		return nhap;
	}

	public static void main(String[] args) {
		// Đầu vào
		Scanner scan = new Scanner(System.in);
		int number1, number2, lua_chon;
		int sum;
		System.out.println("Mời nhập vào 2 số: ");
		number1 = Integer.parseInt(scan.nextLine());
		number2 = Integer.parseInt(scan.nextLine());
		// Xử lý
		do {
			lua_chon = MENU(scan);
			switch (lua_chon) {
			case 1:
				System.out.println("Tổng là: " + (number1 + number2));
				break;
			case 2:
				System.out.println("Hiệu là: " + (number1 - number2));
				break;
			case 3:
				System.out.println("Tích là: " + (number1 * number2));
				break;
			case 4:
				if (lua_chon != 0) {
					System.out.println("Thương là: " + (number1 / number2));
				} else {
					System.out.println("Không thể thực hiện phép chia cho 0");
				}

			default:
				System.out.println("Lỗi!!!!!!!!!!");
				break;
			}

		} while (lua_chon != 0);

	}

}
