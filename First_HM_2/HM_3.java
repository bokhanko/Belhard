import java.util.Scanner;

public class HM_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ВВедите n ");
		int n = sc.nextInt();
		int b = 0;
		sc.close();
		for (int i = 0;; i++) {
			if (i % 3 == 0) {
				b++;
				System.out.println(i);
				if (b == n)
					break;
			}

		}
	}
}
