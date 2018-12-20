import java.util.Scanner;

public class HM_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
      System.out.println("ВВедите число: ");
      int numb = sc.nextInt();
      sc.close();

		int a;
		if (numb % 1 == 0) {
			if (numb % 3 == 0)
				System.out.println("Число " + numb+ " выполняет заданные условия =)");
			else
				System.out.println("Число " + numb+ " не выполняет заданные условия =(");
		}
	}

}
