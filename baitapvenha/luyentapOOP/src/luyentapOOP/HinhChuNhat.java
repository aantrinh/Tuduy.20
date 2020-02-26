package luyentapOOP;

import java.util.Scanner;

public class HinhChuNhat {
	// khởi tạo hàm
	private Float chieuDai, dienTich, chuVi, chieuRong;

	// get,set
	public Float getChieuDai() {
		return chieuDai;
	}

	public Float getChieuRong() {
		return chieuRong;
	}

	public Float getDienTich() {
		return dienTich;
	}

	public Float getChuVi() {
		return chuVi;
	}

	public void setChieuDai(Float chieuDai) {
		this.chieuDai = chieuDai;
	}

	public void setChieuRong(Float chieuRong) {
		this.chieuRong = chieuRong;
	}

	//hàm khởi tạo mặc định
	public HinhChuNhat() {
		
	}
	
	//xử lý
	public void tinhChuVi() {
		this.chuVi= (this.chieuDai+this.chieuRong)*2;
	}
	public void tinhDienTich() {
		this.dienTich= this.chieuDai*this.chieuRong;
	}
	// hàm nhập, xuất
		public void nhap(Scanner scan) {
			System.out.println("Mời bạn nhập chiều dài: ");
			this.chieuDai= Float.parseFloat(scan.nextLine());
			System.out.println("Mời bạn nhập chiều rộng: ");
			this.chieuRong= Float.parseFloat(scan.nextLine());
		}
		public void xuat() {
			System.out.println("chu vi hcn là: "+this.chuVi);
			System.out.println("diên tích hcn là: "+ this.dienTich);
		}
	
}
