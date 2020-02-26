package luyentapOOP;

import java.util.Scanner;

public class demoRun {

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		Scanner scan = new Scanner(System.in);
		HinhChuNhat cd= new HinhChuNhat();
		HinhChuNhat cr= new HinhChuNhat();
		//hcn.nhap(scan);
		cr.setChieuRong("5.5");
		cr.getChieuRong();
		cd.setChieuDai(7.8);
		cd.getChieuDai();
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.xuat();
	}

}
