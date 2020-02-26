package demokethua;

import java.util.Scanner;

public class xengoai extends chuyenxe {
	// thuoc tinh
	private String noiDen;
	private int soNgayDiDuoc;
	
	// get, set
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}
	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	// khoi tao
	
	// nhap xuat
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);// goi thang nhap cua lop cha
		System.out.println("Moi nhap noi den: ");
		this.noiDen= scan.nextLine();
		
		System.out.println(" So ngay di duoc: ");
		this.soNgayDiDuoc= Integer.parseInt(scan.nextLine());
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println(" \t Noi den: "+ this.noiDen+ 
				           "\t So ngay di duoc: "+ this.soNgayDiDuoc);
	}
	
}
