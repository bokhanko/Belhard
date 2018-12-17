
public class TaskSix {
	public static void main(String[] args) {
		int a = 4444;

		int b = a % 10;
		int d = (int) (a % 100 * 0.1);
		int c = (int) (a % 1000 * 0.01);
		int e = (int) (a % 10000 * 0.001);
		if (b == d & d == c & c == e) {
			System.out.println("Все цифры числа равны)");
		} else {
			System.out.println("Цифры числа не равны!");
		}

	}

}
