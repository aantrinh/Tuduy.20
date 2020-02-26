package ungdungnhanvien;

import java.util.ArrayList;
import java.util.Scanner;

public class CtyABC {
	// thuoc tinh
	private String tenCty, diaChiCty;
	private ArrayList<NhanVien> Dsnv;

	// get, set
	public String getTenCty() {
		return tenCty;
	}

	public String getDiaChiCty() {
		return diaChiCty;
	}

	public void setTenCty(String tenCty) {
		this.tenCty = tenCty;
	}

	public void setDiaChiCty(String diaChiCty) {
		this.diaChiCty = diaChiCty;
	}

	// khoi tao
	public CtyABC() {
		this.Dsnv = new ArrayList<NhanVien>();
	}

	public CtyABC(String tenCty, String diaChiCty) {
		this.tenCty = tenCty;
		this.diaChiCty = diaChiCty;
	}
	// nhap , xuat
	public void nhap(Scanner scan) {
		boolean dangNhap = true;
		do {
			System.out.println("Vui long chon: 1. thuc hien 0. thoat ");
			int nhap = Integer.parseInt(scan.nextLine());
			switch (nhap) {
			case 1:
				// khoi tao 1 nhan vien
				NhanVien nv = new NhanVien();
				nv.nhap(scan);
				themNV(nv);
				break;
			case 0: 
				dangNhap = false;
				break;
			}
		}while (dangNhap);
	}
	public void themNV(NhanVien nv) {
		this.Dsnv.add(nv);
	}
	public void xuat() {
		for (NhanVien nv : this.Dsnv) { // foreach: duyệt lớp Nhân viên nv trong Dsnv
			nv.xuat();
		}
	}
}
