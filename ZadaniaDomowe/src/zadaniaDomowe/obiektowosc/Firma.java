package zadaniaDomowe.obiektowosc;

import java.util.Scanner;

public class Firma {

	Pracownik[] pracownicy;

	public Firma() {
		pracownicy = new Pracownik[20];
	}

	public float obliczMiesiecznyKosztFirmy() {
		float koszt = 0;

		for (int i = 0; i < 20; i++) {
			if (pracownicy[i] != null)
				koszt += pracownicy[i].getMiesieczneWynagrodzenie();
		}
		return koszt;

	}

	public float obliczRocznyKosztFirmy() {
		float koszt = 0;
		for (int i = 0; i < 20; i++) {
			if (pracownicy[i] != null)
				koszt += pracownicy[i].getMiesieczneWynagrodzenie();
		}
		return koszt * 12;

	}

	public float obliczDziennyKosztFirmy() {
		float koszt = 0;

		for (int i = 0; i < 20; i++) {
			if (pracownicy[i] != null)
				koszt += pracownicy[i].getMiesieczneWynagrodzenie();
		}
		return koszt / 30;

	}

	public double obliczKosztFirmy(Czas czas, int jednostka) {
		float koszt = 0;
		switch (czas) {
		case DZIEN:
			koszt = obliczDziennyKosztFirmy() * jednostka;

			break;
		case MIESIAC:
			koszt = obliczMiesiecznyKosztFirmy() * jednostka;

			break;
		case ROK:
			koszt = obliczRocznyKosztFirmy() * jednostka;

			break;

		}
		return koszt;

	}

	public void dodajPracownika(Pracownik pracownik) {

		for (int i = 0; i < 20; i++) {
			if (pracownicy[i] == null) {
				pracownicy[i] = pracownik;
				break;
			}

		}
	}

	public void dodajPracownikaInteraktywnie() {

		for (int i = 0; i < 20; i++) {
			if (pracownicy[i] == null) {
				Scanner input = new Scanner(System.in);
				System.out.println("Podaj imie");
				String imie = input.nextLine();
				System.out.println("Podaj nazwisko");
				String nazwisko = input.nextLine();
				System.out.println("Podaj miesiecznie wynagrodzenie");
				float wynagrodzenie = input.nextFloat();
				pracownicy[i] = new Pracownik(imie, nazwisko, wynagrodzenie);
				System.out.println("Pracownik dodany");
				input.close();
				break;
			}

		}
	}

	public float srednieWynagordzenie() {
		float koszt = 0;
		int licznikPracownikow = 0;

		for (int i = 0; i < 20; i++) {
			if (pracownicy[i] != null) {
				koszt += pracownicy[i].getMiesieczneWynagrodzenie();
				licznikPracownikow++;
			}
		}
		return koszt / licznikPracownikow;

	}
}