import java.util.Scanner;

public class baitap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Đầu vào (Input)
		Scanner scan = new Scanner (System.in);
		int money;
		int dongs =  23500;
		
		// Xử lý (Process)
		System.out.println("QUY ĐỔI TIỀN");
		System.out.println("Mời bạn nhập số tiền (đơn vị: USD)");
		money = scan.nextInt();
	
		// Đầu ra (Output)
		System.out.println((money*dongs)+" VND");
	}

}
