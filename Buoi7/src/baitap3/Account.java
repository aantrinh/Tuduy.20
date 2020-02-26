package baitap3;

import java.util.Scanner;

public class Account {
	// thuoc tinh
	private long soTaiKhoan;
	private String tenTK;
	private double soDu;// so tien trong tai khoan
	// get, set
	public long getSoTaiKhoan() {
		return soTaiKhoan;
	}
	public String getTenTK() {
		return tenTK;
	}
	public double getSoDu() {
		return soDu;
	}
	public void setSoTaiKhoan(long soTaiKhoan) {
		this.soTaiKhoan= soTaiKhoan;
	}
	public void setTenTK(String tenTK) {
		this.tenTK= tenTK;
	}
	public void setSoDu(double soDu) {
		this.soDu= soDu;
	}
	// ham khoi tao
	public Account() {
		
	}
	public Account (long soTaiKhoan, String tenTK, double soDu) {
		this.soTaiKhoan= soTaiKhoan;
		this.tenTK= tenTK;
		this.soDu= soDu;
	}
	// nhap, xuat
	public void nhap(Scanner scan) {
		System.out.println(" Moi nhap so tai khoan: ");
		this.soTaiKhoan =scan.nextLong();
		System.out.println(" Moi nhap ten tai khoan: ");
		this.tenTK = scan.nextLine();
		System.out.println("Moi nhap so tien trong tai khoan");
		this.soDu= scan.nextDouble();
	}
	public void xuat() {
		System.out.println("ten tai khoan: "+ this.tenTK+"\t"+
						   "so tai khoan: "+ this.soTaiKhoan+
						   "so du: "+ this.soDu);
	}
}
