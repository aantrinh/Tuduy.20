import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * cho người dùng nhập vào n số nguyên
 *  */
public class baitaptailop {

	public static void main(String[] args) {
		// Câu 1: nhập, xuất mảng
		int[] a = nhapMang();
		xuatMang(a);
		// Câu 2: Số lớn nhất
		List<Integer> indexMax = tatcaMax(a);

		System.out.println("phần tử lớn nhất là: " + a[indexMax.get(0)]);
		// System.out.println("Tai cac chi so: ");
		// for (int i = 0; i < a.length; i++) {
		// if (a[indexMax] == a[i]) {
		// System.out.println(i + "\t");
		// }

	}

	public static int[] nhapMang() {
		int[] kq;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số phần tử n = ");
		int n = Integer.parseInt(scan.nextLine());
		kq = new int[n];
		System.out.println("Nhập dữ liệu cho mảng");
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]=");
			kq[i] = Integer.parseInt(scan.nextLine());
		}
		return kq;
	}

	public static void xuatMang(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}

	}

	public static List<Integer> tatcaMax(int[] a) {
		/*
		 * Bước 1: cho phần tử đầu tiên max bước 2: duyệt mảng bước 3: so sánh phần tử
		 * lớn nhất với phần tử đang duyệt bước 4: Nếu ptMAX<pt đang duyệt--> update lại
		 * ptMAX bước 5: lặp lại đến hết mảng
		 */

		// bước 1
		int indexMax = 0;
		// bước 2
		for (int i = 1; i < a.length; i++) {
			// bước 3
			if (a[indexMax] < a[i]) {
				// bước 4
				indexMax = i; // Cập nhật ptMAX
			}
		}
		/*
		 * Tìm tất cả các số có giá trị bằng số lớn nhất ở trên bước 1: duyệt lại mảng
		 * bước 2: ssanh pt hiện tại với pt lớn nhất bước 3: nếu bằng thì thêm vào mảng
		 * trả về bước 4: duyệt đến hết mảng
		 */
		List<Integer> tatcaMax = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			tatcaMax.add(i);

		}
		return tatcaMax;

	}

}
