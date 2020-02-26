package demokethua;

import java.util.Scanner;

public class chuyenxe {
	// thuoc tinh
	protected int maSoChuyen;
	protected String hoTenXe;
	protected float doanhThu;
	protected int soXe;
	// get, set
	public int getMaSoChuyen() {
		return maSoChuyen;
	}
	public void setMaSoChuyen(int maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}
	public String getHoTenXe() {
		return hoTenXe;
	}
	public void setHoTenXe(String hoTenXe) {
		this.hoTenXe = hoTenXe;
	}
	public int getSoXe() {
		return soXe;
	}
	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	public void setDoanhThu(float doanhThu) {
		this.doanhThu = doanhThu;
	}
	// khoi tao
	public chuyenxe() {
		
	}
	public chuyenxe(int maSoChuyen, String hoTenXe, float doanhThu, int soXe ) {
		this.doanhThu= doanhThu;
		this.hoTenXe = hoTenXe;
		this.maSoChuyen = maSoChuyen;
		this.soXe= soXe;
	}
	// nhap xuat
	public void nhap(Scanner scan) {
		System.out.println(" Moi nhap thong tin xe: ");
		System.out.println(" Nhap ma so chuyen xe: ");
		this.maSoChuyen= Integer.parseInt(scan.nextLine());
		System.out.println(" Moi nhap ho ten ");
		this.hoTenXe = scan.nextLine();
		System.out.println(" Moi nhap so xe:  ");
		this.soXe = Integer.parseInt(scan.nextLine());
		System.out.println("Mời nhap doanh thu: ");
		this.doanhThu= Float.parseFloat(scan.nextLine());
				
	}
	public void xuat() {
		System.out.println("ma so chuyen: "+ this.maSoChuyen+
				" ho ten tai xe: "+ this.hoTenXe+ 
				" so xe: "+ this.soXe+
				" doanh thu: "+ this.doanhThu);
	}
}
