
public class HM_1 {
	public static void main(String args[]) {
		int[] num = { 10, 11, 12, 13, 14, 15 };
		for (int n = 0; n < num.length; n++) {
			int b = 1;
			for (int i = 1; i <= num[n]; i++) {
			b = i * b;
			}
			System.out.println(b);
		}
	}

}
