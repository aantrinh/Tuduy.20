import java.util.Scanner;

public class demoIF {

	public static void main(String[] args) {
	/*
	 * đề bài: Viết chương trình nhập vào 1 số nguyên
	 * nếu như nhập số âm thì sửa lại thành số dương
	 * in ra kết quả cuối cùng*/
		// Đầu vào
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào một số");
		a = scan.nextInt();
		// Xử lý
		/*if (a<0) { 
			a = -a;
			a *= -1; // a = a*-1
			
		}*/
		
		if (a>0) {
			System.out.println("kết quả là: "+ a);
		}
		else {
			System.out.println("kết quả là:" + -a);
		}
		// Đầu ra
	
	}}
