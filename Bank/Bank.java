package Bank;

import java.util.Scanner;

class Bank {
	public int count20;
	public int count50;
	public int count100;
	public int balans;
	public int Cash;
	public final int value20 = 20;
	public final int value50 = 50;
	public final int value100 = 100;

	public Bank() {
		Scanner sc = new Scanner(System.in);
		this.count20 = sc.nextInt();
		this.count50 = sc.nextInt();
		this.count100 = sc.nextInt();
		balans = count20 * value20 + count50 * value50 + count100 * value100;
	}

	public boolean CashOut() {
		Scanner sc2 = new Scanner(System.in);
		int vol20 = 0;
		int vol50 = 0;
		int vol100 = 0;

		// boolean Out;
		Cash = sc2.nextInt();
		int sot = (Cash - Cash % 100) / 100;
		System.out.println(" ??sot1 " + sot);
		if (Cash > balans || Cash % 10 != 0 || Cash % 100 == 30 || Cash % 100 == 10) {// проверили
																						// по
																						// номеналу
			return false;
		} else {
			switch (Cash % 100) {
			case 20:
				vol20 = 1;
				break;
			case 40:
				vol20 = 2;
				break;
			case 50:
				vol50 = 1;
				break;
			case 60:
				vol20 = 3;
				break;
			case 70:
				vol20 = 1;
				vol50 = 1;
				break;
			case 80:
				vol20 = 4;
				break;
			case 90:
				vol50 = 2;
				vol20 = 2;
				break;
			}

			for (int sot1 = 1; sot1 <= sot; sot1++) {
				if (count100 >= 1) {
					count100--;
					vol100++;
					continue;
				}
				if (count50 >= 2) {
					count50 = count50 - 2;
					vol50 = vol50 + 2;
					continue;
				}
				if (count20 >= 5) {
					count20 = count20 - 5;
					vol20 = vol20 + 5;
					continue;
				}
			}

			System.out.println("Использованы купюры номиналом 20:" + vol20 + " шт. Номиналом 50:" + vol50
					+ " шт. Номиналом 100:" + vol100 + " шт.");
			return true;

		}

	}

}
