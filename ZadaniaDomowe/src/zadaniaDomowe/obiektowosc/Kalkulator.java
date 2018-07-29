package zadaniaDomowe.obiektowosc;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double wynik = 0;
		double a, b;
		double zapamietanyWynik = 0;
		boolean koniec = true;

		while (koniec) {

			System.out.println("Podaj liczbę lub wybierz \"w\" ,żeby wczytać poprzedni wynik ");

			String odp = input.next();
			if (odp.equalsIgnoreCase("w")) {
				a = zapamietanyWynik;
			} else
				a = Double.parseDouble(odp);
			System.out.println("Podaj działanie ( +, -, *, / )1");
			char dzialanie = input.next().charAt(0);

			System.out.println("Podaj druga liczbe: ");
			b = input.nextDouble();

			switch (dzialanie) {
			case '+':
				wynik = a + b;
				System.out.println(wynik);

				break;
			case '-':
				wynik = a - b;
				System.out.println(wynik);
				break;
			case '*':
				wynik = a * b;
				System.out.println(wynik);
				break;
			case '/':
				wynik = a / b;
				System.out.println(wynik);
				break;

			default:
				System.out.println("Nie dozowlona operacja");
				break;
			}

			System.out.println("Czy zapamiatac wynik ostatniej operacji? (t/n)");
			String wybor = input.next();
			if ("t".equalsIgnoreCase(wybor)) {
				zapamietanyWynik = wynik;
				System.out.println(zapamietanyWynik);
			} else
				koniec = false;

		}

	}
}
