package buoi2;

import java.util.Scanner;

public class cautruchammoi {
	public static void HienThiMeNu() {
		System.out.println("MENU");
		System.out.println("1.xuất tổng 2 số");
		System.out.println("2.xuất hiệu 2 số");
		System.out.println("3.xuất tích 2 số");
		System.out.println("4.xuất thương 2 số");
	}

	public static void main(String[] args) {
		/*
		 * viết chương trình cho nhập vào 2 số int: in ra 1 menu như sau 1.xuất tổng 2
		 * số xuất hiệu 2 số xuất tích 2 số xuất thương 2 số cho người dùng chọn
		 */
// Đầu vào
		Scanner scan = new Scanner(System.in);
		System.out.println("nhập số 1");
		int so_1 = Integer.parseInt(scan.nextLine());
		System.out.println("nhập số 2");
		int so_2 = Integer.parseInt(scan.nextLine());

		HienThiMeNu(); // Gọi hàm
		System.out.print("Mời chọn số 1 đến 4>>>> ");
		int lua_chon = Integer.parseInt(scan.nextLine());
		Xuly(lua_chon, so_1, so_2);

	}

	public static void Xuly(int lua_chon, int so_1, int so_2) {
		switch (lua_chon) {
		case 1:
			System.out.println("kết quả tổng là:" + (so_1 + so_2));
			break;
		case 2:
			System.out.println("kết quả hiệu là:" + (so_1 - so_2));
			break;
		case 3:
			System.out.println("kết quả tích là:" + (so_1 * so_2));
			break;
		case 4:
			if (so_2 != 0) {
				System.out.println("kết quả thương là:" + (so_1 / so_2));
			} else {
				System.out.println("không thực hiện phép chia cho 0 được");
			}
			break;
		default:
			System.out.println("Bạn chọn sai. Chọn 1 đến 4");

		}
	}
}
