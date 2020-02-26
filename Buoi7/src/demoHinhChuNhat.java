import java.util.Scanner;

public class demoHinhChuNhat {

	private float chieuDai;
	private float chieuRong;
	private float chuVi;
	private float dienTich;

	public float getChieuDai() {
		return chieuDai;
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public void setChieuDai(float _chieuDai) {
		this.chieuDai = _chieuDai;
	}

	public void setChieuRong(float _chieuRong) {
		this.chieuRong = _chieuRong;
	}

	public float getChuVi() {
		return chuVi;
	}

	public float getDienTich() {
		return dienTich;
	}

	// Các phương thức khởi tạo
	public demoHinhChuNhat() {

	}

	public demoHinhChuNhat(float _chieuDai, float _chieuRong) {
		this.chieuDai = _chieuDai;
		this.chieuRong = _chieuRong;
	}

	// các phương thức khác
	public void tinhChuVi() {
		this.chuVi = (this.chieuDai + this.chieuRong) * 2;
	}

	public void tinhDienTich() {
		this.dienTich = this.chieuDai * this.chieuRong;
	}

	// phương thức nhập xuất
	public void nhap(Scanner scan) {
		System.out.println("Vui lòng nhập chiều dài: ");
		this.chieuDai = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập chiều rộng: ");
		this.chieuRong = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		tinhChuVi();
		tinhDienTich();
		System.out.println("hình chữ nhật có Diện tích là: " + this.dienTich + " và chu vi là: " + this.chuVi
				+ " có chiều dài là: " + this.chieuDai + "có chiều rộng là: " + this.chieuRong);

	}
}
