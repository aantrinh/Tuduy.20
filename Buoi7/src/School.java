import java.util.ArrayList;
import java.util.Scanner;

/*
 * mục đích: xử lý các nghiệp vụ của trường học
 * version 1.0*/
public class School {
	// Thuộc tính
	private String tenTruong, diaChi;
	private ArrayList<Student> dssv;

	// Get,set
	public String getTenTruong() {
		return tenTruong;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDSSV() {
		this.dssv = dssv;
	}

	public void setTenTruong() {
		this.tenTruong = getTenTruong();
	}

	public void setDiaChi() {
		this.diaChi = getTenTruong();
	}

	// Phương thức khởi tạo
	public School() {
		this.dssv = new ArrayList<Student>();// khởi tạo ds sinh viên
	}

	// Nhập, xuất
	public void nhap(Scanner scan) {
		boolean dangNhap = true;
		do {
			System.out.println("Vui lòng nhập sinh viên, nhấn 0 để thoát");
			int nhap = Integer.parseInt(scan.nextLine());
			switch (nhap) {
			case 1:
				// khởi tạo một sinh viên
				Student sv = new Student();
				sv.nhap(scan);
				themStudent(sv);
				break;
			case 0:
				dangNhap = false;
				break;

			}
		} while (dangNhap);
	}

	public void themStudent(Student sv) {
		this.dssv.add(sv);
	}

	public void xuat() {
		for (Student sv : this.dssv) { // foreach: duyệt lớp Student sv trong dssv
			sv.xuat();
		}
	}

	// Các phương thức khác
	public void tinhDiemTB() {
		for (Student sv : this.dssv) {
			sv.diemTrungBinh();
		}
	}

	public void xepLoaiSV() {
		for (Student sv : this.dssv) {
			sv.xepLoai();
		}
	}

	public void diemTBMax() {
		int vitrimax = 0;
		for (int i = 0; i < this.dssv.size(); i++) {
			if (this.dssv.get(vitrimax).getDiemTB() < this.dssv.get(i).getDiemTB()) {
				vitrimax = i;
			}

			System.out.println(this.dssv.get(vitrimax));

		}
	}

	public ArrayList<Student> timDSSVDTBCaoNhat() {
		Student sv;
		ArrayList<Student> dsMax = new ArrayList<Student>();
		if (this.dssv.size() > 0) {
			// buoc 1: gan sv dau tien la sv dtb max
			sv = this.dssv.get(0);
			// buoc 2: duyet mang
			for (Student svBuoi : this.dssv) {
				if (svBuoi.getDiemTB() > sv.getDiemTB()) {
					sv = svBuoi;
				}
			}
			// duyet lai lan nua, tim tat ca nhung thang co dtb bang voi dtb cua sv vua tim
			// ra o tren, dua vao list
			for (Student svChuoi : this.dssv) {
				if (svChuoi.getDiemTB() == sv.getDiemTB()) {
					dsMax.add(svChuoi);
				}
			}
		}
		return dsMax;
	}

	public void xuatDS(ArrayList<Student> list) { // ham helper: ho tro xuat
		for (Student sv : list) {
			sv.xuat();
		}
	}

	public ArrayList<Student> dsYeu() {
		ArrayList<Student> list = new ArrayList<Student>();
		/*
		 * buoc 1: kiem tra size >0 buoc 2: duyet mang buoc 3: lay dtb so sanh voi 5--->
		 * neu xay ra thi them vao danh sach buoc 4: lap den het
		 **/
		if (this.dssv.size() > 0) {
			for (Student svBuoi : this.dssv) {
				if (svBuoi.getDiemTB() < 5) {
					list.add(svBuoi);
				}
			}
		}
		return list;
	}

	public ArrayList<Student> timDSSVTheoTen(String ten) {
		ArrayList<Student> list = new ArrayList<Student>();
		for (Student sv : this.dssv) {
			if (sv.getTen().equals(ten)) { // so sanh chuoi trong java
				list.add(sv);
			}
		}
		return list;
	}

	public ArrayList<Student> timDSSVTheoMaSV(String maSV) {
		ArrayList<Student> list = new ArrayList<Student>();
		for (Student sv : this.dssv) {
			if (sv.getMaSV().equals(maSV)) {
				list.add(sv);
			}
		}
		return list;
	}

	public Student timSV_theo_ma(String maSV) {
		Student sv_tim = null;
		for (Student sv : this.dssv) {
			if (sv.getMaSV().equals(maSV)) {
				sv_tim = sv;
				break;
			}
		}
		return sv_tim;
	}
// cách 1: xóa sinh viên
	public boolean xoaSinhvien(String maSV) {
		boolean kq = false;
		Student sv = timSV_theo_ma(maSV);
		if (sv != null) {
			// xoa khoi danh sach
			this.dssv.remove(sv);
		}
		return kq;
	}
// cách 2: xóa sinh viên
	public void xoaSV(Scanner scan) {
		// System.out.println("nhập mã SV cần xóa:");
		// String ms = new String();
		// ms= scan.nextLine();
		System.out.print("Moi nhap ma sv de xoa: ");
		String maSV_xoa = scan.nextLine();
		Student sv_xoa = this.timSV_theo_ma(maSV_xoa);
		if (sv_xoa != null) {
			System.out.println("Da tim thay sv voi ma " + sv_xoa.getMaSV());
			this.dssv.remove(sv_xoa);
		} else {
			System.out.println("SV khong dc tim thay");
		}
	}

}
