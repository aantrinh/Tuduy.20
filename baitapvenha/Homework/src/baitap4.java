import java.util.Scanner;

public class baitap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Đầu vào (Input)
		Scanner scan = new Scanner (System.in);
		int dai;
		int rong;
		
		// Xử lý (Process)
		System.out.println("Mời bạn nhập chiều dài");
		dai = scan.nextInt();
	
		System.out.println("Mời bạn nhập chiều rộng");
		rong = scan.nextInt();
		// Đầu ra (Output)
		System.out.println("Diện tích hình chữ nhật là: "+(dai*rong));
		System.out.println("Chu vi hình chũ nhật là: "+(dai+rong)*2);
	}

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
