import java.util.Scanner;

public class baitap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scan = new Scanner(System.in);
		// int x = 5;
		// x = Integer.parseInt(scan.nextLine());
		// float f = Float.parseFloat(scan.nextLine());

		// Đầu vào
		String hoTen;
		float toan, ly, hoa, diem_tb;
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào Họ và Tên");
		hoTen = (scan.nextLine());
		System.out.println("Mời nhập vào điểm môn Toán");
		toan = Float.parseFloat(scan.nextLine());
		System.out.println("Mời bạn nhập điểm môn Lý");
		ly = Float.parseFloat(scan.nextLine());
		System.out.println("Mời bạn nhập vào môn Hóa");
		hoa = Float.parseFloat(scan.nextLine());
		// Xử lý
		diem_tb = (toan + ly + hoa) / 3;
		System.out.println("Điểm trung bình là: " +diem_tb);
		// Đầu ra
		if (diem_tb > 8.5) {
			System.out.println("Xếp loại: " +"Loại Giỏi");
		} else if (diem_tb <= 8.5 && diem_tb >= 6.5) {
			System.out.println("Xếp loại: "+"Loại Khá");
		} else if (diem_tb < 6.5 && diem_tb >= 5.5) {
			System.out.println("Xếp loại: "+"Loại TB");
		} else {
			System.out.println("Xếp loại: "+"Loại Yếu");
		}

	}

}
