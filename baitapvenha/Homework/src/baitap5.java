import java.util.Scanner;

public class baitap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Đầu vào (Input)
		Scanner scan = new Scanner(System.in);
		int so;
		int hang_dv;
		int hang_chuc;
		
		// Xử lý (Process)
		System.out.println("Nhập vào 1 số có 2 chữ số (VD:12,49,98)");
		so = Integer.parseInt(scan.nextLine());
		hang_dv = so % 10;
		hang_chuc = so / 10;
				
	
		// Đầu ra (Output)
		System.out.println("Tổng 2 ký số vừa nhập là: "+(hang_dv+hang_chuc));
		
	}

}
