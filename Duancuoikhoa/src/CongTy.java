import java.util.ArrayList;
import java.util.Scanner;

public class CongTy {
	// private static final TruongPhong TruongPhong = null;
	private String tenCty;
	private String maSoThue;
	private float doanhThuThang;
	private ArrayList<NhanSu> dsnv;

	// get, set
	public String getTenCty() {
		return tenCty;
	}

	public void setTenCty(String tenCty) {
		this.tenCty = tenCty;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public ArrayList<NhanSu> getDsnv() {
		return dsnv;
	}

	public void setDsnv(ArrayList<NhanSu> dsnv) {
		this.dsnv = dsnv;
	}

	public float getDoanhThuThang() {
		return doanhThuThang;
	}

	public CongTy() {
		this.dsnv = new ArrayList<NhanSu>();
	}

	public void nhapNhanVien(Scanner scan) {
		int dangNhap = 0;
		do {
			System.out.println(" Mời chọn loại nhân sự");
			System.out.println(" 1. Nhân viên");
			System.out.println(" 2. Trưởng phòng");
			System.out.println(" 3. Giám đốc");
			System.out.println(" 0. Thoát chương trình");
			System.out.print(" MỜI CHỌN SỐ >>>>>>>>>>");
			dangNhap = Integer.parseInt(scan.nextLine());
			NhanSu ns;
			switch (dangNhap) {
			case 1:
				ns = new NhanVien();
				ns.nhap(scan);
				this.dsnv.add(ns);
				break;
			case 2:
				ns = new TruongPhong();
				ns.nhap(scan);
				// casting ép đối tượng

				this.dsnv.add(ns);
				break;
			case 3:
				ns = new Sep();
				ns.nhap(scan);
				this.dsnv.add(ns);
				break;
			case 0:
				break;
			default:
				System.out.println(" Chọn 1,2,3 hoặc 0 để thực hiện chương trình");
				break;
			}
		} while (dangNhap != 0);
		// phân bổ nhân viên
		phanBoNV(scan);
	}

	public void nhapThongTin(Scanner scan) {
		System.out.println(" Mời nhập tên công ty");
		this.tenCty = scan.nextLine();
		System.out.println(" Mời nhập mã số thuế");
		this.maSoThue = scan.nextLine();
	}

	//
	public void phanBoNV(Scanner scan) {
		// 1. tìm toàn bộ ds trưởng phòng
		ArrayList<NhanSu> listTruongPhong = lietKeTatCaTP();
		// 2. in ra để người dùng chọn trưởng phòng cho nhân viên
		System.out.println(" ----Danh sách trưởng phòng-----");
		xuatDSNhanVienTheoMavaTen(listTruongPhong);
		// 3. gán mã trưởng phòng cho nhân viên
		for (NhanSu ns : this.dsnv) {
			if (ns instanceof NhanVien) { // instanceof: thể hiện của

				// yêu cầu người dùng chọn mã trưởng phòng trong ds trên
				System.out.println(" Vui lòng chọn trưởng phòng cho nhân viên: ");
				ns.xuatMavaTen();
				System.out.print("Mời chọn >>>>>>"); // sử dụng vòng lặp bắt người dùng nhập đúng mã TP, use While
				int chonMaTP = Integer.parseInt(scan.nextLine());
				((NhanVien) ns).setMaTP(chonMaTP);

				// 4. tăng số lượng nhân viên thêm 1 cho trưởng phòng đó
				TruongPhong TP = (TruongPhong) timNhanSuTheoMa(chonMaTP, listTruongPhong);
				TP.tangsoluongNV();
			}
		}

	}

	public ArrayList<NhanSu> lietKeTatCaTP() {
		ArrayList<NhanSu> list = new ArrayList<NhanSu>();
		for (NhanSu ns : this.dsnv) {
			if (ns instanceof TruongPhong) {
				list.add(ns);
			}
		}
		return list;
	}

	public void xuatDSNhanVienTheoMavaTen(ArrayList<NhanSu> list) {
		for (NhanSu ns : list) {
			ns.xuatMavaTen();
		}
	}

	public void xuatDSNhanVien() {
		for (NhanSu ns : this.dsnv) {
			ns.tinhLuong();
			ns.xuat();
		}
	}

	public NhanSu timNhanSuTheoMa(int ma, ArrayList<NhanSu> list) {
		NhanSu ns = null;
		for (NhanSu nSu : list) {
			if (nSu.getMaSo() == ma) {
				ns = nSu;
			}
		}
		return ns;
	}
	// câu 2: thêm, xóa, sửa thông tin một nhân viên (Lưu ý khi xóa TP, phải ngắt
	// liên kết với các nhân viên đang được tham chiếu)
	/*
	 * TH1: tìm ns trong ds nếu không có -> báo không có ns trong dsach voi ma do
	 * TH2: Nếu có thì Duyệt lại DS
	 * 1/ Trưởng phòng: 
	 * + Duyệt DS -> nếu mã TP = mã hiện tại -> set mã TP =-1 hoặc nâng cao chọn lại trưởng phòng
	 * + Xoa TruongPhong
	 * 2/ Nhân viên: 
	 * + lấy mã TP-> tìm TP -> giảm SLNS của trưởng phòng này
	 * + Remove NV khỏi dsach nhân sự
	 * 3/ Giám đốc: + remove GĐ (Trường hợp này không ràng buộc cty phải có tối thiểu 1 giám đốc)
	 */

	public void xoaNhanVien(int maNS) {
		NhanSu nhanSu = timNhanSuTheoMa(maNS, this.dsnv);
		if(nhanSu == null) {
			System.out.println(" Không có nhân viên có mã này trong cty của tôi");
		} else {
				if(nhanSu instanceof TruongPhong) { // truong hop la Truong Phong
					for (NhanSu ns : this.dsnv) {
						if(ns instanceof NhanVien && ((NhanVien) ns).getMaTP() == maNS) {
							((NhanVien) ns).setMaTP(-1);
							// Nang cao: Moi ve nha lam truong hop con lai
						}
					}
					//this.dsnv.remove(nhanSu);
				} else if(nhanSu instanceof NhanVien) {
					for (NhanSu ns : this.dsnv) {
						int maTrp = ((NhanVien) nhanSu).getMaTP();
					TruongPhong trP = (TruongPhong)timNhanSuTheoMa(maTrp, this.dsnv);
					trP.giamsoluongNV();
					//this.dsnv.remove(nhanSu);
						}	
				}
//				else if(nhanSu instanceof Sep) {
//					
//				}
				} this.dsnv.remove(nhanSu);
			
		}
	public void tinhTongLuong() {
//		NhanVien nv = new NhanVien();
//		TruongPhong tp = new TruongPhong();
//		Sep sep = new Sep();
		float tongLuong=0;
//		tongLuong = nv.getLuongThang()+tp.getLuongThang()+sep.getLuongThang();
		for(NhanSu ns : this.dsnv) {
			ns.tinhLuong();
			tongLuong += ns.luongThang;
		}
		System.out.println("TONG LUONG CONG TY LA: "+ tongLuong);
	}
	// Tim TrPhong co luong cao nhat
	public void truongPhongLuongMax() {
		float luongMax=0;
		for (NhanSu ns: this.dsnv) {
			if(ns instanceof TruongPhong) {
				ns.getLuongThang()==luongMax;
					
				
			}
		}
	}
		
	}

