import java.util.Scanner;

/*
 * Đề bài: Viết chương trình cho nhập vào 10 số
 * Tính tổng 10 số vừa nhập
 * Xuất tổng*/
public class baitap1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int so, tong = 0;
		int so_lan_lap = 10;
		while (so_lan_lap > 0) {
			System.out.println("Mời bạn nhập vào số");
			so = Integer.parseInt(scan.nextLine());
			tong += so;
			so_lan_lap--;
		}
		System.out.println("Tổng là: " + tong);

	}

}
