import java.util.Scanner;

public class NhanSu {
	// thuộc tính
	protected int maSo;
	protected String hoTen;
	protected int soDienThoai;
	protected int ngayLamViec;
	protected float luongThang;

	// get, set
	public int getMaSo() {
		return maSo;
	}

	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public int getNgayLamViec() {
		return ngayLamViec;
	}

	public void setNgayLamViec(int ngayLamViec) {
		this.ngayLamViec = ngayLamViec;
	}

	public float getLuongThang() {
		return luongThang;
	}

	public void setLuongThang(float luongThang) {
		this.luongThang = luongThang;
	}

	// khởi tạo
	public NhanSu() {
	}

	public NhanSu(int maSo, String hoTen, int soDienThoai, int ngayLamViec, int luong1ngay, float luongThang) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.ngayLamViec = ngayLamViec;
		this.luongThang = luongThang;
	}

	// nhap, xuat
	public void nhap(Scanner scan) {
		System.out.println(" Mời nhập mã số: ");
		this.maSo = Integer.parseInt(scan.nextLine());
		System.out.println(" Mời nhập họ&tên: ");
		this.hoTen = scan.nextLine();
		System.out.println(" Mời nhập SĐT: ");
		this.soDienThoai = Integer.parseInt(scan.nextLine());
		System.out.println(" Mời nhập số ngày làm việc: ");
		this.ngayLamViec = Integer.parseInt(scan.nextLine());
	}

	public void xuat() {
		System.out.print("Nhân viên: ");
		System.out.println(" họ&tên: " + this.hoTen + "\t" + " mã số: " + this.maSo + "\t" + " số điện thoại: "
				+ this.soDienThoai + "\t" + " sô ngày làm việc: " + this.ngayLamViec + "\t");
	}

	// phương thức khác
	public void tinhLuong() {
		this.luongThang = 0;
	}

	public void xuatMavaTen() {
		System.out.println(" tên: " + this.hoTen + "mã số: " + this.maSo);
	}
}