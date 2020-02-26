import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CongTy cty = new CongTy();
		NhanSu ns = new NhanSu();
		Scanner scan = new Scanner (System.in);
		cty.nhapNhanVien(scan);
		//ns.tinhLuong();
		cty.xuatDSNhanVien();
		cty.tinhTongLuong();
//		System.out.println(" Mời nhập mã nhân viên cần xóa");
//		int maNS = Integer.parseInt(scan.nextLine());
//		cty.xoaNhanVien(maNS);
		
	}

}
