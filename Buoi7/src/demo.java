import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String hoTen, email;
		System.out.println("Mời nhập tên và email: ");
		// Tạo đối tượng sinh vien 1 thuộc lớp sinh viên
		SinhVien sv1 = new SinhVien();
		// Tạo đối tượng sinh vien2 thuộc lớp sinh viên
		SinhVien sv2 = new SinhVien();
		// ****** Truy xuất thuộc tính và tạo dữ liệu cho sinh viên
		// sinh viên 1
		sv1.setHoTen(hoTen = scan.nextLine());
		sv1.setEmail(email = scan.nextLine());
		// sinh viên 2
		sv2.setHoTen(hoTen = scan.nextLine());
		sv2.setEmail(email = scan.nextLine());

		System.out.println("Sinh viên 1: Tên: " + sv1.getHoTen() + " email: " + sv1.getEmail());
		System.out.println("Sinh viên 2: Tên: " + sv2.getHoTen() + " email: " + sv2.getEmail());
	}

}
