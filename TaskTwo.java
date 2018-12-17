
public class TaskTwo {
	public static void main(String[] args){
	int a = 48;
	int b,d,c;
	b = a/100;
	d = a%10;
	c = a%2; 
	if (b>1){
		System.out.println("Число " + a + " является трехзначным");
	};
	if (d == 7){
		System.out.println("Последняя цифра числа " + a + " является семеркой");
	};
	if (c == 0){
		System.out.println("Число " + a + " является четным");
	}
	}

}
