import java.util.Scanner;

public class suabaitap_buoi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// baitap2
		// kĩ thuật cộng dồn dùng biến TỔNG "sum"
		/*
		 * a=a+b viết tắt là a+=b 
		 * */
		// đầu vào
		float so_tb = 0;
		Scanner scan = new Scanner(System.in);
		// xử lý
		System.out.println("mời bạn nhập số thứ nhẩt");
		so_tb += scan.nextFloat();
		System.out.println("mời bạn nhập số thứ hai");
		so_tb += scan.nextFloat();
		System.out.println("mời bạn nhập số thứ ba");
		so_tb += scan.nextFloat();
		System.out.println("mời bạn nhập số thứ tư");
		so_tb += scan.nextFloat();
		System.out.println("mời bạn nhập số thứ năm");
		so_tb += scan.nextFloat();
		so_tb/= 5;
		// đầu ra
		System.out.println(so_tb);
	}

}
