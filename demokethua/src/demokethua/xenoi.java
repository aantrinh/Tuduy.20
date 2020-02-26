package demokethua;

import java.util.Scanner;

public class xenoi extends chuyenxe{
	private int soTuyen;
	private float soKM;
	
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public float getSoKM() {
		return soKM;
	}
	public void setSoKM(float soKM) {
		this.soKM = soKM;
	}
	// khoi tao
	public xenoi() {
		
	}
	public xenoi(int soTuyen, float soKM) {
		this.soTuyen = soTuyen;
		this.soKM = soKM;
	}
	public xenoi(int soTuyen, float soKM, int maSoChuyen, String hoTenXe, int soXe, float doanhThu ) {
		super(maSoChuyen, hoTenXe, doanhThu, soXe);// lay tu lop chuyen xe qua
		this.soTuyen = soTuyen;
		this.soKM = soKM;
	}
	// nhap xuat
	
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);// goi thang nhap cua lop cha
		System.out.println("Nhap so tuyen: ");
		this.soTuyen= Integer.parseInt(scan.nextLine());
		
		System.out.println("nhap so KM: ");
		this.soKM= Float.parseFloat(scan.nextLine());
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println(" \t so tuyen: "+ this.soTuyen+ 
				           "\t so KM: "+ this.soKM+
				           "\t doanh thu: "+ this.doanhThu);
	}
	// phuong thuc khac
	
}
