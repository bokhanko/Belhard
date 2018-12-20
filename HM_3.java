import java.util.Scanner;

public class HM_3 {
	public static void main(String args[]) {
//int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ВВедите n ");
		int n = sc.nextInt();
		int [] a = new int [n];
		System.out.println("ВВедите начало диапазона ");
		int numb_start = sc.nextInt();
		System.out.println("ВВедите конец диапазона ");
		int numb_end = sc.nextInt();
		sc.close();
		for ( ;numb_start<=numb_end; numb_start++){
			if (numb_start%3==0){a[numb_start] =a[numb_start];
			 
			System.out.println(numb_start);}
		}
		
		
	}
}

