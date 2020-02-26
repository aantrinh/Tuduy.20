import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class reviewhomework {
	public static int[] nhapMang() {
		Scanner scan = new Scanner(System.in);
		int so_nguyen;
		int[] a; // khai báo mảng tên là a
		System.out.println("Mời bạn nhập vào 1 số nguyên: ");
		so_nguyen = Integer.parseInt(scan.nextLine());
		a = new int[so_nguyen];
		for (int i = 0; i < so_nguyen; i++) {
			System.out.println("a[" + i + "]=");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static void xuatMang(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" + a[i]);

		}
	}

	public static int timMax(int[] a) {
		int indexMax = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[indexMax] < a[i]) {
				indexMax = i;
			}
		}
		return indexMax;
	}

	public static int timAm(int[] a) {
		int soAm = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				soAm = i; // tìm thấy âm
				break; // thoát vòng lặp for
			}
		}
		return soAm;
	}

	public static int timAmMax(int a[]) {
		int index = timAm(a);
		for (int i = index; i < a.length; i++) {
			// cho âm lớn nhất tại index
			if (a[i] < 0 && a[i] > a[index]) {
				index = i;
			}
		}
		return index;
	}

	public static float tinhTongChan(int[] a) {
		float tong = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				tong += a[i];
			}
		}
		return tong;
	}

	public static int demSo(int a[]) {
		int dem_so_am = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				dem_so_am++;
			}
		}
		return dem_so_am;
	}

	public static int timX(int a[], int x) {
		int timX = -1; // chưa tìm thấy x
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				timX = i; // tìm thấy x
				break;
			}
		}

		return timX;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// câu 1: nhập và xuất mảng
		int[] a = nhapMang();
		xuatMang(a);
		// câu 2: tìm số lớn nhất và vị trí của nó trong mảng
		int indexMax = timMax(a);
		System.out.println("phần tử lớn nhất tại chỉ số : " + indexMax + "co gia tri la: " + a[indexMax]);
		// câu 3: tìm số âm đầu tiên trong mảng và vị trí của nó
		/*
		 * đầu vào: mảng a các số nguyên đầu ra: chỉ số, giá trị âm đầu tiên có các
		 * trường hợp sau: 1/-1 2 3 6 4 2/ 3 2 5 4 -6 3/ 2 3 4 8 6 4/-2 -3 -6 -9 5/ 1 2
		 * -3 4 9
		 * 
		 * thuật toán b1: duyệt mảng b2: lấy từng phần tử và so sánh với 0 b3: ktra ptu
		 * hiện tại<0 thì tìm thấy và break; b4: nếu chưa tìm thấy thì tiếp tục bước 1
		 * đến hết mảng
		 */
		int soAm = timAm(a);
		if (soAm < 0) {
			System.out.println("Không tìm thấy số âm trong mảng");
		} else
			System.out.println("tìm thấy giá trị đầu tiên trong mảng: " + soAm + "có giá trị là: " + a[soAm]);
		// câu 7: tìm x
		System.out.println("nhap so can tim");
		int x = Integer.parseInt(scan.nextLine());
		int timX = timX(a, x);
		System.out.println("số x là: " + timX);
		// In menu
		thucHien(scan, a);
	}

	public static void inMenu() {
		System.out.println("Vui lòng chọn chức năng: ");
		System.out.println("1. Tính tổng dương");
		System.out.println("2. Tìm âm Max");
		System.out.println("3. Đếm số dương");
		System.out.println("0. Thoát");
	}

	public static void thucHien(Scanner scan, int a[]) {
		int dangThucHien = 0;
		do {
			inMenu();
			System.out.println("Vui lòng chọn số: ");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				// câu 5: tính tổng các số chẳn
				float tong = tinhTongChan(a);
				System.out.println("tổng các số chẳn là: " + tong);
				break;
			case 2:
				// câu 4: tìm số âm lớn nhất trong mảng và chỉ số của nó
				/*
				 * đầu vào: mảng a đầu ra: số âm max và vị trí data: tương tự câu 3 tiếp theo
				 * thuật toán: b1: gán 1 số âm đầu tiên = max b2: so sánh với các số âm khác
				 * trong mảng, nếu lớn hơn thì update số âm đó = max b3: duyệt lại đến cuối mảng
				 */
				int vitrisoAmMax = timAmMax(a);
				if (vitrisoAmMax < 0) {
					System.out.println("không có số âm trong mảng");
				} else
					System.out.println("Số âm lớn nhất là: " + a[vitrisoAmMax] + "tại vị trí thứ: " + vitrisoAmMax);

				break;
			case 3:
				// câu 6: đếm số
				int dem_so_am = demSo(a);
				System.out.println("có các số âm: " + dem_so_am);

				break;
			default:
				System.out.println("Kết thúc");
				break;
			}
		} while (dangThucHien != 0);
	}

}
