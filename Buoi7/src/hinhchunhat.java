import java.util.Scanner;

public class hinhchunhat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Xử lý
		demoHinhChuNhat hcn = new demoHinhChuNhat();
		hcn.nhap(scan);
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.xuat();
	}

}
