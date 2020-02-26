package buoi2;

import java.util.Scanner;

public class baitap1 {

	public static void main(String[] args) {
		// Đầu vào
		Scanner scan = new Scanner (System.in);
		int m,n;
		System.out.println("Mời bạn nhập vào số nguyên thứ nhất");
		m = scan.nextInt();
		System.out.println("Mời bạn nhập số nguyên thứ hai");
		n = scan.nextInt();
		// Xử lý
		System.out.println("Số nguyên lớn nhất là: ");
		if (m>n) {System.out.println(m);}
		else {System.out.println(n);}
		
		
	}

}
