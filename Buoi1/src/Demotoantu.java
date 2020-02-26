import java.util.Scanner;

public class Demotoantu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Đầu vào (input)
		Scanner scan = new Scanner (System.in);
		int so_1;
		int so_2;
		
		// Xử lý (Process)
		System.out.println("Mời bạn nhập số thứ nhất: ");
		so_1 = scan.nextInt();
		
		System.out.println("Mời bạn nhập số thứ hai: ");
		so_2 = scan.nextInt();
		
		// Đầu ra (output)
		System.out.println("Tổng 2 số là: " + (so_1 + so_2));
		
	}

}
