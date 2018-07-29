package zadaniaDomowe.obiektowosc;

public class FirmaMain {

	public static void main(String[] args) {

		Firma firma = new Firma();

		firma.pracownicy[0] = new Pracownik("Basia", "Kowalska", 2500);
		firma.pracownicy[1] = new Pracownik("Kasia", "Kowalska", 2500);

		System.out.println(firma.obliczMiesiecznyKosztFirmy());

		System.out.println(firma.obliczKosztFirmy(Czas.MIESIAC, 2));

		Pracownik pr = new Pracownik("Zosia", "Kaczmaek", 5000);

		firma.dodajPracownika(pr);
		System.out.println(firma.obliczMiesiecznyKosztFirmy());
		firma.dodajPracownikaInteraktywnie();
		System.out.println(firma.obliczMiesiecznyKosztFirmy());
		System.out.println("Srednie wynagodzenie: " + firma.srednieWynagordzenie());

	}

}
