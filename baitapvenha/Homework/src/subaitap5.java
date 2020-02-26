import java.util.Scanner;

public class subaitap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Đầu vào
		Scanner scan = new Scanner(System.in);
		int so, so_hang_chuc,so_hang_dv,tong;
		System.out.println("mời bạn nhập số");
		
		
		//Xử lý
		so = scan.nextInt();
		so_hang_chuc = so / 10; // dấu / giúp lấy phần thương
		so_hang_dv = so % 10;   // dấu % giúp lấy phần dư, tương tự phép chia hàng trăm thì chia cho 100
		tong = so_hang_chuc + so_hang_dv;
		//Đầu ra
		System.out.println(tong);
		
	}

}
