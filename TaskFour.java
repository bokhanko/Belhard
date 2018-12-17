import java.util.Random;

public class TaskFour {
	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt();

		if (x % 100 >= 11 && x % 100 <= 19 || x % 100 <= -11 && x % 100 >= -19) {
			System.out.println(+x + " Рублей ");
		} else if (x % 10 == 1 || x % 10 == -1) {
			System.out.println(+x + " Рубль");
		} else if (x % 10 == 2 || x % 10 == -2 || x % 10 == 3 || x % 10 == -3 || x % 10 == 4 || x % 10 == -4) {
			System.out.println(+x + " Рубля ");

		} else if (x % 10 == 0 || x % 10 == 5 || x % 10 == -5 || x % 10 == 6 || x % 10 == -6 || x % 10 == 7
				|| x % 10 == -7 || x % 10 == 8 || x % 10 == -8 || x % 10 == 9 || x % 10 == -9) {
			System.out.println(+x + " Рублей ");
		}

		

	}

}
