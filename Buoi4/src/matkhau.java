
public class matkhau {

	public static void main(String[] args) {
		int n = 1;

		final int num_compare = 12345;

		int total = 0;

		while (true) {
			total += n;
			if (total >= num_compare) {
				break;
			}
			n++;
		}
		System.out.println(n);
	}

}
