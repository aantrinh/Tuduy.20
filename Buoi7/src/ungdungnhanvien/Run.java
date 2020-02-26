package ungdungnhanvien;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		NhanVien nv = new NhanVien();
		nv.nhap(scan);
		nv.tinhLuong();
		nv.xuat();
	}

}
