package thuvienX;

import java.util.Scanner;

public class Tusach {
// thuoc tinh
	protected int maSach;
	protected String ngayNhap;
	protected float donGia;
	protected int soLuong;
	protected String nhaXuatBan;
	protected float thanhTien = soLuong*donGia;
	// get, set
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}
	public String getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	public float getThanhTien() {
		return thanhTien;
	}
	// khoi tao
	public Tusach() {
		
	}
	public Tusach(int maSach, String ngayNhap, float donGia, int soLuong, String nhaXuatBan, float thanhTien) {
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
		this.thanhTien = thanhTien;
	}
	// nhap, xuat
	protected void nhap(Scanner scan) {
		System.out.println("Menu hướng dẫn");
		System.out.println("Mời nhập mã sách: ");
		this.maSach = Integer.parseInt(scan.nextLine());
		System.out.println("Mời nhập ngày nhập sách: ");
		this.ngayNhap = scan.nextLine();
		System.out.println("Mời nhập đơn giá: ");
		this.donGia = Float.parseFloat(scan.nextLine());
		System.out.println("Mời nhập lương: ");
		this.soLuong = Integer.parseInt(scan.nextLine());
		System.out.println("Mời nhập nhà xuất bản: ");
		this.nhaXuatBan = scan.nextLine();
				
	}
	protected void xuat() {
		System.out.println("Mã sách là: "+ this.maSach+"\t"+
						" Ngày nhập: "+ this.ngayNhap+ "\t"+
						" Đơn giá: "+ this.donGia+ "\t"+
						" Số lượng: "+ this.soLuong+ "\t"+
						" Nhà xuất bản: "+this.nhaXuatBan);
	}
	// phương thức khác
	protected void tinhthanhtien() {
		
	}
}