package Bank;


public class Main {
	public static void main(String[] args) {

		System.out.print("Введите количество банкнот номиналом(20,50,100): ");
		Bank b1 = new Bank();
		System.out.print("Сколько хотите снять?: ");
		if (b1.CashOut()) {
			System.out.println("Операция осуществленна успешно");
		} else {
			System.out.println("Операция невозможна");
		}
		
	}
}
		


