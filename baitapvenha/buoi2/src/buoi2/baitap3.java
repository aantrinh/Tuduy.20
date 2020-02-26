package buoi2;

import java.util.Scanner;

public class baitap3 {

	public static void main(String[] args) {
		// Đầu vào
		int a, b, c, d, e;
		int dem_so_chan = 0, dem_so_le = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Nhập số thứ nhất: ");
		a = Integer.parseInt(scan.nextLine());
		if (a % 2 == 0) {
			dem_so_chan++;
		} else {
			dem_so_le++;
		}

		System.out.print("Nhập số thứ hai: ");
		b = Integer.parseInt(scan.nextLine());
		if (b % 2 == 0) {
			dem_so_chan++;
		} else {
			dem_so_le++;
		}

		System.out.print("Nhập số thứ ba: ");
		c = Integer.parseInt(scan.nextLine());
		if (c % 2 == 0) {
			dem_so_chan++;
		} else {
			dem_so_le++;
		}

		System.out.print("Nhập số thứ tư: ");
		d = Integer.parseInt(scan.nextLine());
		if (d % 2 == 0) {
			dem_so_chan++;
		} else {
			dem_so_le++;
		}

		System.out.print("Nhập số thứ năm: ");
		e = Integer.parseInt(scan.nextLine());
		if (e % 2 == 0) {
			dem_so_chan++;
		} else {
			dem_so_le++;
		}

		// Xử lý

		// Đầu ra
		System.out.println("Có: " + "số chẳn: " + dem_so_chan + "số lẻ" + dem_so_le);
		// một số cách tối ưu cho bài trên
		/*
		 * System.out.print("Nhập số thứ nhất: "); if (Integer.parseInt(scan.nextLine
		 * ()) % 2 == 0) {dem_so_chan++;} else {dem_so_le++;}
		 * 
		 * cách khác không cần dùng biến dem_so_le là: 5- dem_so_chan
		 */
	

	}

}
