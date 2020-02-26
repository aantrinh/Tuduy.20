import java.util.Scanner;

public class baitapMenu {
	public static int Menu(Scanner scan) {
		int nhap;
		do {
		System.out.println("MENU");
		System.out.println("0. Thoát");
		System.out.println("1.Tính tổng");
		System.out.println("2.Tính hiệu");
		System.out.println("3.Tính tích");
		System.out.println("4.Tính thương");
		System.out.println("Mời chọn từ 1 đến 4 >>>>>");
		 nhap = Integer.parseInt(scan.nextLine());
		} while (nhap<0 || nhap>4);
		return nhap;

	}

	public static void main(String[] args) {
		/*
		 * viết chương trình nhập vào 2 số 1 lần duy nhất in ra Menu 1. xuất tổng 2.
		 * hiệu 3. thương 4. tích Xử lý từng trường hợp, chon 0 thì thoát chtrinh chọn 1
		 * đến 4 thì in kết quả, sau đó in lại menu cho người dùng chọn lại
		 */
		// Đầu vào
		Scanner scan = new Scanner(System.in);
		int so_1, so_2, tong, hieu, thuong, tich;
		int lua_chon;
		System.out.println("Mời nhập vào 2 số");
		so_1 = Integer.parseInt(scan.nextLine());
		so_2 = Integer.parseInt(scan.nextLine());
		// Xử lý
		do {

			lua_chon = Menu(scan);
			switch (lua_chon) {
			case 1:
				System.out.println("Tổng 2 số là: " + TongHaiSo(so_1, so_2));
				break;
			case 2:
				System.out.println("Hiệu 2 số là: " + HieuHaiSo(so_1, so_2));
				break;
			case 4:
				System.out.println("Tích 2 số là: " + TichHaiSo(so_1, so_2));
				break;
			case 3:
				System.out.println("Thương 2 số là: " + ThuongHaiSo (so_1,so_2));
				break;
			}

		} while (lua_chon != 0);

	}

	public static int TongHaiSo(int a, int b) {
		return a + b;
	}
	public static int HieuHaiSo(int a, int b) {
		return a - b;
	}
	public static int TichHaiSo(int a, int b) {
		return a * b;
	}
	public static int ThuongHaiSo(int a, int b) {
		return a / b;
	}
}
