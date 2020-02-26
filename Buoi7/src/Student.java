import java.util.Scanner;

public class Student {
	// Danh sách Thuộc tính
	private String ten, xepLoai, maSV;
	private float  diemToan, diemLy, diemHoa, diemTB;

	

	// Các phương thức get, set
	public float getDiemTB() {
		return diemTB;
	}

	public String getXepLoai() {
		return xepLoai;
	}
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	// Các phương thức khởi tạo
	public Student() {

	}

	public Student(String ten, String maSV, float diemToan, float diemLy, float diemHoa) {
		super();
		this.ten = ten;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	// Các hàm nhập, xuất
	public void nhap(Scanner scan) {
		System.out.println("Vui lòng nhập tên SV: ");
		this.ten = scan.nextLine();
		System.out.println("Vui lòng nhập mã SV: ");
		this.maSV = scan.nextLine();
		System.out.println("Vui lòng nhập điểm toán: ");
		this.diemToan = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập điểm lý: ");
		this.diemLy = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập điểm hóa: ");
		this.diemHoa = Float.parseFloat(scan.nextLine());

	}

	public void xuat() {
		System.out.println("Sinh viên: " + this.ten + " Mã SV: " + this.maSV + "\t" + "điểm Toán: " + this.diemToan
				+ "\t" + "điểm Lý: " + this.diemLy + "\t" + "điểm Hóa: " + this.diemHoa + "\t" + "điểm TB: "
				+ this.diemTB + "\t" + "xếp loại: " + this.xepLoai);
	}
	// Các phương thức khác

	public void diemTrungBinh() {
		this.diemTB = (this.diemHoa + this.diemLy + this.diemToan) / 3;
	}

	public void xepLoai() {
		if (this.diemTB >= 9) {
			this.xepLoai = "Loại xuất sắc";
		} else if (this.diemTB < 9 && this.diemTB >= 8) {
			this.xepLoai = "Loại giỏi";
		} else if (this.diemTB >= 7 && this.diemTB < 8) {
			this.xepLoai = "Loại khá";
		} else if (this.diemTB >= 6 && this.diemTB < 7) {
			this.xepLoai = "Loại trung bình khá";
		} else if (this.diemTB >= 5 && this.diemTB < 6) {
			this.xepLoai = "Loại trung bình";
		} else if(this.diemTB < 5)
			this.xepLoai = "Loại yếu";
	}
}
