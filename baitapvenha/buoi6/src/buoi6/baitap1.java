package buoi6;

import java.util.Scanner;

public class baitap1 {
	public static void inMenu() {
		System.out.println("Vui lòng chọn chức năng bên dưới từ 1 đến 10: ");
		System.out.println("0. De thoat chuong trinh");
		System.out.println("1. Tổng các số dương");
		System.out.println("2. Tính tổng các số lẻ");
		System.out.println("3. Đếm có bao nhiêu số dương");
		System.out.println("4. Tìm số nhỏ nhất trong mảng");
		System.out.println("5. Tìm số dương nhỏ nhất trong mảng");
		System.out
				.println("6. Tìm số chẵn cuối cùng trong mảng 1 chiều các số nguyên. Nếu mảng không có giá trị chẵn\r\n"
						+ "thì trả về -1");
		System.out
				.println("7. Viết hàm tìm số chẵn đầu tiên trong mảng các số nguyên. Nếu mảng không có giá trị chẵn\r\n"
						+ "thì trả về -1");
		System.out.println("8. Tìm số nguyên tố đầu tiên trong mảng 1 chiều các số nguyên. Nếu mảng không có số\r\n"
				+ "nguyên tố thì trả về – 1");
		System.out
				.println("9. Tìm số dương cuối cùng trong mảng số thực. Nếu mảng không có giá trị dương thì trả về -1");
		System.out
				.println("10. Hãy tìm giá trị chẵn nhỏ nhất trong mảng 1 chiều các số nguyên. Nếu mảng không có số\r\n"
						+ "chẵn thì trả về -1\r\n" + "");
	}

	public static void thucHienMenu(int a[], Scanner scan) {
		int nhap_so;
		boolean thoat = true;
		do {
			inMenu();
			System.out.println("Chọn 1 số bất kỳ");
			nhap_so = Integer.parseInt(scan.nextLine());
			int kq;
			switch (nhap_so) {
			case 0:
				thoat = false;
				break;
			case 1: tinhTongDuong(a);
				break;
			case 2: tongSoLe(a);
			break;
			case 3: demSoDuong(a);
			break;
			case 4: timMin(a);
			break;
			case 5: timDuongMin(a);
			break;
			case 6: 
				kq = timChan(a);
				if(kq!=-1) {
					System.out.println("so chan cuoi cung trong mang co gia tri la "+a[kq]);
					System.out.println("Nam o vi tri thu "+ kq+" cua mang");
				}
			break;
			case 7: timChanDau(a);
			break;
			case 9: 
			break;
			default:
				System.out.println("moi chon tu 0 - 10!");
				break;
			}
		}while(thoat);
	}

	public static int tinhTongDuong(int a[]) {
		int tong = 0;
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				tong += i;
			}
		}
		return tong;
	}

	public static int tongSoLe(int a[]) {
		int tongLe = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				tongLe += i;
			}
		}
		return tongLe;
	}

	public static int demSoDuong(int a[]) {
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				dem++;
			}
		}
		return dem;
	}

	public static int timMin(int a[]) {
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[min]) {
				min = i;
			}
		}
		return min;
	}

	public static int timDuongMin(int a[]) {
		int minDuong = timMin(a);
		for (int i = 0; i < a.length; i++) {
			if (a[minDuong] > 0) {
				minDuong = i;
			}
		}
		return minDuong;
	}

	public static int timChan(int a[]) {
		int index_so_chan = -1;
		for(int i = 0;i <a.length;i++) {
			if(a[i]%2==0) {
				index_so_chan = i;
				break;
			}
		}
		if(index_so_chan != -1) {
			for(int i = index_so_chan + 1;i<a.length;i++) {
				if(a[i]%2==0) {
					index_so_chan = i;
				}
			}
		}
		return index_so_chan;
	}

	public static int timChanDau(int a[]) {
		int timChan = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				timChan = a[i];
				break;
			} else
				timChan = -1;
		}
		return timChan;
	}
	public static void soNguyenTo(int a[]) {
		int nguyenTo;
		for(int i =0;i<a.length;i++) {
			
		}
	}
	public static int[] nhapMang(Scanner scan) {
		System.out.print("Moi nhap so phan tu: ");
		int n = Integer.parseInt(scan.nextLine());
		int mang[] = new int[n];
		for(int i = 0; i<mang.length;i++) {
			System.out.println("Moi nhap phan tu thu "+ i+ " : ");
			mang[i]=Integer.parseInt(scan.nextLine());
		}
		return mang;
	}
	public static void main(String[] args) {
		// Đầu vào
		Scanner scan = new Scanner(System.in);
		int[] a = nhapMang(scan);
		thucHienMenu(a, scan);
		// Xử lý

		// Đầu ra
	}

}
