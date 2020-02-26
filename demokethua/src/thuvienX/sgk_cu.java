package thuvienX;

public class sgk_cu extends sachgiaokhoa{
	private final float GIAMGIA = (float) 0.5;
	@Override 
	public void tinhthanhtien() {
		this.thanhTien = this.soLuong * this.donGia * GIAMGIA;
	}
}
