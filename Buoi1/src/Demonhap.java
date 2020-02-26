import java.util.Scanner;

/*
 * Ngày tạo: 23/7/2019
 * Người tạo: Ân
 * Mục đích: viết chương trình cho nhập vào tên người trong mộng
 * Xuất ra chuỗi "[Tên mình] yêu [ Tên nhập vào]"*/

public class Demonhap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Bước 1: Nhập tên người trong mộng
		int year = 2019;
		System.out.println("Mời bạn nhập tên người trong mộng");
		String my_love_name = scan.nextLine();
		
		// Bước 2: In ra tên người yêu  thử
		System.out.print("Ân yêu " + my_love_name + year);
		
		
	}

}
