import java.util.Scanner;

public class baitap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Đầu vào (Input)
			Scanner scan = new Scanner (System.in);
			int days; // biến này để lưu số ngày làm mà người dùng nhập
			final int SALARY = 100000; //hằng số(constant) final dùng ko cho thêm biến về sau, cách viết là chữ IN
			int luongTong;
		
		
		
		// Xử lý (Process)
			System.out.println("HỆ THỐNG TÍNH LƯƠNG TỰ ĐỘNG");
			System.out.println("Mời nhập số ngày làm việc");
			days = scan.nextInt();
			luongTong = days*SALARY; // cách 2
			
		// Đầu ra (Output)
			System.out.println("Tiền lương tháng này của bạn là: "+ (days * SALARY)); //cách 1
			System.out.println("tiền lương là: "+ luongTong);
		
		
	}

}
