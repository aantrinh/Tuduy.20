package buoi2;

import java.util.Scanner;

public class suabaitap6 {

	public static void main(String[] args) {
		// Đầu vào
		Scanner scan = new Scanner(System.in);
		int shc, shdv, so_nhap;
		System.out.println("Mời bạn nhập số có 2 chữ số: ");
		so_nhap = Integer.parseInt(scan.nextLine());
		// Xử lý
		shc = so_nhap / 10;
		shdv = so_nhap % 10;
		
		// Đầu ra
		switch (shc) {
		case 1: {
			System.out.println("Mười");
			break;
		}
		case 2: {
			System.out.println("Hai mươi");
			break;
		}
		case 3: {
			System.out.println("Ba mươi");
			break;
		}
		case 4: {
			System.out.println("Bốn mươi");
			break;
		}
		case 5: {
			System.out.println("Năm mươi");
			break;
		}
		case 6: {
			System.out.println("Sáu mươi");
			break;
		}
		case 7: {
			System.out.println("Bảy mươi");
			break;
		}
		case 8: {
			System.out.println("Tám mươi");
			break;
		}
		case 9: {
			System.out.println("Chín mươi");
			break;
		}
		}
		switch (shdv) {
		case 1:
			if (shc == 1) {
				System.out.println("một");
			} else {
				System.out.println("mốt");
			}
			break;
		case 2:
			System.out.println("hai");
			break;
		case 3:
			System.out.println("ba");
			break;
		case 4:
			System.out.println("bốn");
			break;
		case 5:
			System.out.println("lăm");
			break;
		case 6:
			System.out.println("sáu");
			break;
		case 7:
			System.out.println("bảy");
			break;
		case 8:
			System.out.println("tám");
			break;
		case 9:
			System.out.println("chín");
			break;
		}

	}
}