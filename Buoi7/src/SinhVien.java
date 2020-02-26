/*
 * muc đích: Xử lý các nghiệp vụ liên quan đến lớp sinh viên
 * người tạo: Ân
 * ngày: 13/8
 * Version: 1.0
 * */
public class SinhVien {
	// Thuoc tinh/data members
	//public String hoTen;
	//public String email;
	private String hoTen;
	private String email;
	//Phương thức get,set
	public String getHoTen(){
		return hoTen;
	}
	public void setHoTen(String _hoTen) {
		this.hoTen = _hoTen;
	}
	// email
	public String getEmail() {
		return email;
	}
	public void setEmail(String _email) {
		this.email = _email;
	}
	// phương thức khởi tạo mặc định
	public SinhVien() {
		
	}
	public SinhVien(String _hoTen) {
		this.hoTen = _hoTen;
	}
	public SinhVien(String _hoTen, String _email) {
		this.hoTen = _hoTen;
		this.email = _email;
	}
	
	
}
