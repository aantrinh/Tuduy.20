import java.util.ArrayList;
import java.util.Scanner;

/*
 * cho phép người dùng nhập vào: tên, mã sv, điểm toán, lý, hóa. cho phép nhập nhiều sinh viên và thực hiện
 * */
public class QuanLySinhVien {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		School truong = new School();
		Student sv = new Student();
		// sv.nhap(scan);
		truong.nhap(scan);
		truong.tinhDiemTB();
		truong.xepLoaiSV();
		truong.xuat();
		System.out.println("sinh vien co dtb cao nhat la: ");
		// cach 1
		ArrayList<Student> list = truong.timDSSVDTBCaoNhat();
		truong.xuatDS(list);
		// cach 2
		// truong.xuatDS(truong.timDSSVDTBCaoNhat());
		System.out.println("ds nhung sinh vien yeu la: ");
		truong.xuatDS(truong.dsYeu());
		// tìm sv theo tên
		System.out.println("tim sinh vien theo Ten: ");
		String ten = scan.nextLine();
		truong.xuatDS(truong.timDSSVTheoTen(ten));
		// tìm sinh viên theo mã sv
		System.out.println("tìm sinh viên theo mã SV: ");
		String maSV = scan.nextLine();
		// truong.xuatDS(truong.timDSSVTheoMaSV(maSV));
		sv = truong.timSV_theo_ma(maSV);
		if (sv != null) {
			sv.xuat();
		} else
			System.out.println("không tìm thấy sinh viên theo mã");
		// xóa sinh viên
		// System.out.println("mời nhập mã sv cần xóa");
		// String ms = scan.nextLine();
		// truong.xoaSV(scan);
	}

}
