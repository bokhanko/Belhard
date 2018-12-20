
public class TaskFive {
	public static void main(String[] args) {
		int a = 4578;

		int b = (a % 10) * 1000;
		int d = ((int) (a % 100 * 0.1)) * 100;
		int c = (int) (a % 1000 * 0.01) * 10;
		int e = (int) (a % 10000 * 0.001);
		int f = b + d + c + e;
		System.out.println(" Число  = " + f);
	}

}
