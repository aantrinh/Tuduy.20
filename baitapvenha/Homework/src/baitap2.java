import java.util.Scanner;

public class baitap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Đầu vào (Input)
		Scanner scan = new Scanner (System.in);
		float so_1;
		float so_2;
		float so_3;
		float so_4;
		float so_5;
		float trung_binh_cong;
		float so1,so2,so3,so4,so5; // cách nhập biến cùng kiểu dữ liệu trên cùng một dòng
		
		// Xử lý (Process)
		System.out.println("Mời bạn nhập số thứ nhất");
		so_1 = scan.nextInt();
		System.out.println("Mời bạn nhập số thứ hai");
		so_2 = scan.nextInt();
		System.out.println("Mời bạn nhập số thứ ba");
		so_3 = scan.nextInt();
		System.out.println("Mời bạn nhập số thứ tư");
		so_4 = scan.nextInt();
		System.out.println("Mời bạn nhập số thứ năm");
		so_5 = scan.nextInt();
		trung_binh_cong = (so_1+so_2+so_3+so_4+so_5)/5;
		// Đầu ra (Output)
		System.out.println("Giá trị trung bình là "+ trung_binh_cong);
		
		
		
			
	}

}
