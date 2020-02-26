package demokethua;

import java.util.ArrayList;
import java.util.Scanner;

public class congtyV {
	private ArrayList<chuyenxe> dscx;
	private float tongDoanhThu;
	private float doanhThuXeNoi, doanhThuXeNgoai;

// get set

	public ArrayList<chuyenxe> getDscx() {
		return dscx;
	}

	public float getDoanhThuXeNoi() {
		return doanhThuXeNoi;
	}

	public void setDoanhThuXeNoi(float doanhThuXeNoi) {
		this.doanhThuXeNoi = doanhThuXeNoi;
	}

	public float getDoanhThuXeNgoai() {
		return doanhThuXeNgoai;
	}

	public void setDoanhThuXeNgoai(float doanhThuXeNgoai) {
		this.doanhThuXeNgoai = doanhThuXeNgoai;
	}

	public float getTongDoanhThu() {
		return tongDoanhThu;
	}

	public void setDscx(ArrayList<chuyenxe> dscx) {
		this.dscx = dscx;
	}

	public congtyV() {
		dscx = new ArrayList<chuyenxe>();
	}

	public void nhap(Scanner scan) {
		// boolean dangThucHien = true;
		int chon;
		do {
			System.out.println("vui long chon 1. noi thanh 2. ngoai thanh 0. thoat");
			chon = Integer.parseInt(scan.nextLine());
			chuyenxe cx;
			switch (chon) {
			case 1: {
				cx = new xenoi();// co che da xe cho phep lay du lieu con tu cha // da hinh the hien tai day
				cx.nhap(scan);
				this.dscx.add(cx);
				break;
			}
			case 2: {
				cx = new xengoai();
				cx.nhap(scan);
				this.dscx.add(cx);
				break;
			}

			}
		} while (chon != 0);
		this.tongDoanhThu();
		this.tinhDTXeNoi();
		this.tinhDTXeNgoai();
	}

	public void xuat() {
		for (chuyenxe xe : this.dscx) {
			xe.xuat();
		}
	}

	public void tongDoanhThu() {
		this.tongDoanhThu = 0;
		for (chuyenxe xe : this.dscx) {
			this.tongDoanhThu += xe.doanhThu;
		}
	}

// doanh thu tung xe
	public void tinhDTXeNoi() {
		this.doanhThuXeNoi = 0;
		for (chuyenxe xe : this.dscx) {
			if (xe instanceof xenoi) {
				this.doanhThuXeNoi += xe.doanhThu;
			}
		}
	}

	public void tinhDTXeNgoai() {
		this.doanhThuXeNgoai = 0;
		for (chuyenxe xe : this.dscx) {
			if (xe instanceof xengoai) {
				this.doanhThuXeNgoai += xe.doanhThu;
			}
		}
	}
}
