package ungdungnhanvien;

import java.util.Scanner;

public class NhanVien {
	// Thuộc tính
	private String hoTen, maNV, ngaySinh, diaChi;
	private Float heSoLuong, thanhTien;
	private int luongCB = 853000;

	// get,set
	public String getHoTen() {
		return hoTen;
	}

	public String getMaNV() {
		return maNV;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public Float getHeSoLuong() {
		return heSoLuong;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void setHeSoLuong(Float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public Float getThanhTien() {
		return thanhTien;
	}

	// Phuong thuc khoi tao
	public NhanVien() {
		
	}
	public NhanVien(String hoTen, String maNV, String diaChi, String ngaySinh, float heSoLuong) {
		this.hoTen = hoTen;
		this.maNV = maNV;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		//this.luongCB = luongCB;
		this.heSoLuong = heSoLuong;
	}
	public void tinhLuong() {
		thanhTien = this.heSoLuong*this.luongCB;
	}
	// nhap
	public void nhap(Scanner scan) {
		System.out.println("Moi nhap theo huong dan: ");
		System.out.println("nhap ten: ");
		this.hoTen = scan.nextLine();
		System.out.println("nhap ma NV: ");
		this.maNV = scan.nextLine();
		System.out.println("nhap dia chi: ");
		this.diaChi = scan.nextLine();
		System.out.println("nhap ngay sinh: ");
		this.ngaySinh = scan.nextLine();
		System.out.println("nhap he so luong: ");
		this.heSoLuong = Float.parseFloat(scan.nextLine());
	}
	// xuat
	public void xuat() {
		System.out.println("Nhan vien: "+ this.hoTen+"\t"+
							"ma nhan vien: "+ this.maNV+"\t"+
							" ngay sinh: "+ this.ngaySinh+"\t"+
							" dia chi: "+ this.diaChi +"\t"+
							" he so luong: "+this.heSoLuong+"\t"+
							" thanh tien: "+this.thanhTien);
	}
	// xu ly
	
	
}
