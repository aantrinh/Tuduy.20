package buoi2;

import java.util.Scanner;

public class baitap4 {

	public static void main(String[] args) {
		// Đầu vào
		String hoTen1, hoTen2, hoTen3;
		int firstNumber, secondNumber, thirdNumber;
		Scanner scan = new Scanner(System.in);

		System.out.print("Mời bạn nhập tên của mình: ");
		hoTen1 = scan.nextLine();
		System.out.print("Năm sinh: ");
		firstNumber = Integer.parseInt(scan.nextLine());

		System.out.print("Mời bạn nhập tên của mình: ");
		hoTen2 = scan.nextLine();
		System.out.print("Năm sinh: ");
		secondNumber = Integer.parseInt(scan.nextLine());

		System.out.print("Mời bạn nhập tên của mình: ");
		hoTen3 = scan.nextLine();
		System.out.print("Năm sinh: ");
		thirdNumber = Integer.parseInt(scan.nextLine());

		// Xử lý
		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println("Sinh viên trẻ nhất: ");
			System.out.println(hoTen1);
			System.out.println(firstNumber);
		} else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println("Sinh viên trẻ nhất: ");
			System.out.println(hoTen2);
			System.out.println(secondNumber);
		} else {
			System.out.println("Sinh viên trẻ nhất: ");
			System.out.println(hoTen3);
			System.out.println(thirdNumber);
		}

		// Đầu ra
	
	}

}
