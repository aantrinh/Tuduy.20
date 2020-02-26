package buoi2;

public class ifelserutgon {

	public static void main(String[] args) {
		int a = 3;
		if (a % 2 == 0) {
			System.out.println("chẳn");
		} else {
			System.out.println("lẻ");
		}
		// ifelse rút gọn
		String ketQua = a % 2 == 0 ? "chẳn" : "lẻ";
		System.out.println(ketQua);
	}

}
