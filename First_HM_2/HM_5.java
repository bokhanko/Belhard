import java.util.Random;

public class HM_5 {
	public static void main(String[] args) {
		int[] mas = new int[10];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++)
			mas[i] = rand.nextInt(10);
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		int n = mas.length;
		int temp;
		for (int i = 0; i < n / 2; i++) {
			temp = mas[n - i - 1];
			mas[n - i - 1] = mas[i];
			mas[i] = temp;
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i] + " ");

		}

	}
}
