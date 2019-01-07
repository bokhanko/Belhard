
public class HM_1_2 {
	public static void main(String args[]) {

		for (int i = 10; i <= 15; i++) {
			long b = 1;
			for (int n = 1; n <= i; n++) {
				b = n * b;
			}
			System.out.println("Факториал числа " + i + " равен: " + b);
			continue;

		}
	}

}
