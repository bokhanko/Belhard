package CIrcle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.print("Введите параметры первой окружности(x,y,r): ");
		Circle o1 = new Circle();
		System.out.print("Введите параметры второй окружности(x,y,r): ");
		Circle o2 = new Circle();
		o2.distanseCircle(o1);
		System.out.println("Растояние между центрами окружностей = " + o1.distanseCircle(o2));
		if (o1.testCircle(o2)) {
			System.out.println("Окружности имеют одну общую точку");
		} else {
			System.out.println("Окружности не имеют одной общей точки");
		}
		o1.LengthCircle();
		System.out.println("Длинна первой окружности равна = " + o1.LengthCircle());
		o1.moveCircle();// слегка не допер как красиво вывести "Измененные
						// координаты окружности"
		o2.LengthCircle();
		System.out.println("Длинна второй окружности равна = " + o2.LengthCircle());
		o2.moveCircle();

	}

}
