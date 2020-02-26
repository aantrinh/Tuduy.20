import java.util.Scanner;

/*
 * Đề bài: Viết chương trình cho nhập vào số liên tục
 * Tính tổng các số vừa nhập, nếu nhập 0 thì thoát vòng lặp
 * Xuất tổng*/
public class baitap2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int so, tong = 0;
//		while (so != 0) {
//			System.out.println("Mời bạn nhập số: ");
//			so = Integer.parseInt(scan.nextLine());
//			tong += so;
//		}

		do {
			System.out.println("Mời bạn nhập số: ");
			so = Integer.parseInt(scan.nextLine());
			tong += so;

		} while (so != 0);
		System.out.println("Tổng là: " + tong);
	}

}
