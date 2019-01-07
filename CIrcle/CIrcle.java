package CIrcle;

import java.util.Scanner;

class Circle {
	public double x;
	public double y;
	public double r;
	public double dis; // пока хз куда его запихнуть(и да это не совсем верно)

	public Circle() {
		Scanner sc = new Scanner(System.in);
		this.x = sc.nextDouble();
		this.y = sc.nextDouble();
		this.r = sc.nextDouble();
		if (r <= 0) {
			System.out.println("Радиус окружности не может быть равен нолю или меньше ноля");
		}
	}

	public double distanseCircle(Circle next)// в упор не понимаю как он
												// присваивает данные от о2((
	{
		dis = Math.sqrt(Math.pow((x - next.x), 2) + Math.pow((y - next.y), 2));
		return dis;
	}

	public boolean testCircle(Circle next) {
		if (this.distanseCircle(next) == (double) (this.r + next.r)
				|| this.distanseCircle(next) == (double) (this.r - next.r)) {
			if (this.x != next.x || this.y != next.y || this.r != next.r) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public double LengthCircle() {
		double l = 2.0 * 3.14 * r;
		return l;

	}

	public void moveCircle() {

		x = x + (Math.random() * 198 - 99);
		y = y + (Math.random() * 99);
		System.out.println("Измененные координаты окружности (" + x + ";" + y + ")");
	}

}
