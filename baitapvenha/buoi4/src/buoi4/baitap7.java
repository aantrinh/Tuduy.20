package buoi4;

import java.util.Scanner;

public class baitap7 {
	public static int Menu(Scanner scan) {
		int so;
		do {
			System.out.println("1. kéo");
			System.out.println("2. búa");
			System.out.println("3. bao");
			System.out.println("0. kết thúc game");
			System.out.println("Mời nhập 1 số: ");
			so = Integer.parseInt(scan.nextLine());
			if (so < 0 || so > 3) {
				System.out.println("Lỗi!!!! Mời chọn lại từ 1>>>>3");
			}
		} while (so < 0 || so > 3);
		return so;
	}

	public static void main(String[] args) {
		// Đầu vào
		Scanner scan = new Scanner(System.in);
		int lua_chon_cua_may = (int) (Math.random() * 3 + 1);
		int keo = 3;
		int bua = 2;
		int bao = 1;
		int so, kq=0;
		//3>1>2>3;
		
		// Xử lý

		do {
			so = Menu(scan);
			lua_chon_cua_may = Integer.parseInt(scan.nextLine());
			switch (so) {
			case 1:
				kq = keo - lua_chon_cua_may;
				System.out.println("kết quả là: " + kq);
				break;
			case 2:
				kq = bua - lua_chon_cua_may;
				System.out.println("kết quả là: " + kq);
				break;
			case 3:
				kq = bao - lua_chon_cua_may;
				System.out.println("kết quả là: " + kq);
				break;

			default:
				System.out.println("Trò chơi kết thúc");
				break;
			}
			if (kq>0) {
				System.out.println("Xin chúc mừng. Bạn đã chiến thắng");
			}else if (kq==0) {
				System.out.println("Hòa");
			}else System.out.println("Thua");
		} while (so != 0);
		// Đầu ra

	}

}
