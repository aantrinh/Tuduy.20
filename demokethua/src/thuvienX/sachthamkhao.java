package thuvienX;

import java.util.Scanner;

class sachthamkhao extends Tusach {
// thuộc tính
	private float thue = 10 / 100;
	private float thanhTien;

	// get,set
	public float getThue() {
		return thue;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	public void setThue(float thue) {
		this.thue = thue;
	}

	public void setThanhTien(float thanhTien) {
		this.thanhTien = thanhTien;
	}

	// hàm khởi tạo
	public sachthamkhao() {

	}

	public sachthamkhao(float thue, float thanhTien) {
		this.thanhTien = thanhTien;
		this.thue = thue;
	}

	// nhap xuất
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("thành tiền: "+ this.thanhTien);
	}
	// xử lý
	public void thanhTien() {
		this.thanhTien = this.thue * this.getSoLuong() * this.getDonGia();
	}
}
