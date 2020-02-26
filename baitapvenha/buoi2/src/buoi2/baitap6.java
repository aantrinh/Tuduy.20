package buoi2;

import java.util.Scanner;

public class baitap6 {

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
		if (shc == 1) {
			System.out.println("Mười");
		} else if (shc == 2) {
			System.out.println("Hai mươi");
		} else if (shc == 3) {
			System.out.println("Ba mươi");
		} else if (shc == 4) {
			System.out.println("Bốn mươi");
		} else if (shc == 5) {
			System.out.println("Năm mươi");
		} else if (shc == 6) {
			System.out.println("Sáu mươi");
		} else if (shc == 7) {
			System.out.println("Bảy mươi");
		} else if (shc == 8) {
			System.out.println("Tám mươi");
		} else if (shc == 9) {
			System.out.println("Chín mươi");
		}
		if (shdv == 1) {
			if (shc == 1) {
				System.out.println("mốt");
			} else {
				System.out.println("một");
			}
		} else if (shdv == 2) {
			System.out.println("hai");
		} else if (shdv == 3) {
			System.out.println("ba");
		}
		else if (shdv== 4) {
			System.out.println("bốn");
		}
		else if (shdv==5) {
			System.out.println("lăm");
		}
		else if (shdv==6) {
			System.out.println("sáu");
		}
		else if (shdv==7) {
			System.out.println("bảy");
		}
		else if (shdv==8) {
			System.out.println("tám");
		}
		else if (shdv==9) {
			System.out.println("chín");
		}

	}

}
