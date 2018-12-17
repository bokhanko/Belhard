
public class TaskThree {
	public static void main(String[] args) {
		double a, b, r, kr, pr, l;
		a = 10;
		b = 15;
		r = 9.2;
		pr = a * a + b * b;
		l = Math.sqrt(pr);
		kr = 2 * r;

		if (kr >= l) {
			System.out.println(" Прямоугольное отверстие размером " + a + " x " + b
					+ "может быть закрыто круглой картонкой радиусом " + r);
		}

	}

}
