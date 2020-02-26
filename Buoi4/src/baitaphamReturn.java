import java.util.Scanner;

/*
 * Đề bài: Viết chương trình nhập vào 3 số nguyên
 * Xuất ra trị tuyệt đối của 3 số nguyên đó*/
public class baitaphamReturn {
	public static void XuLyTriTuyetDoi(int number, String chuoi) {
		if (number < 0) {
			number = -number;
		}
		System.out.println(chuoi + number);
	}
	
	public static int XuLyTriTuyetDoi2(int number) {
		if (number < 0) {
			number = -number;
		}
		return number;
	}

	public static void main(String[] args) {
		// Đầu vào
		Scanner scan = new Scanner(System.in);
		int so_1, so_2, so_3;
		System.out.println("Mời nhập vào 3 số nguyên: ");
		System.out.println("Số thứ nhất: ");
		so_1 = Integer.parseInt(scan.nextLine());
		System.out.println("Số thứ hai: ");
		so_2 = Integer.parseInt(scan.nextLine());
		System.out.println("Số thứ ba: ");
		so_3 = Integer.parseInt(scan.nextLine());
		// Xử lý
		XuLyTriTuyetDoi(so_1, "Số thứ nhất ");
		XuLyTriTuyetDoi(so_2, "Số thứ hai ");
		XuLyTriTuyetDoi(so_3, "Số thứ ba ");
		
		so_1 = XuLyTriTuyetDoi2(so_1);
		so_2 = XuLyTriTuyetDoi2(so_2);
		so_3 = XuLyTriTuyetDoi2(so_3);
		// Đầu ra
		System.out.println("Số 1: "+so_1);
		System.out.println("Số 2: "+so_2);
		System.out.println("Số 3: "+so_3);
	}
	

}
