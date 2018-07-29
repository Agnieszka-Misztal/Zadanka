package zadaniaDomowe.obiektowosc;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {

	List<Ksiazka> listaKsiazek;

	public Biblioteka() {

		this.listaKsiazek = new ArrayList<Ksiazka>();
		listaKsiazek.add(new Ksiazka("Ktoki", "Zosia Zielona", 2016));
		listaKsiazek.add(new Ksiazka("Burek", "Tomek Kowalski", 2016));
		listaKsiazek.add(new Ksiazka("Ptaki polskie", "Zygmunt Nowak", 2016));
		listaKsiazek.add(new Ksiazka("Igor w Chinach", "Igor Kaczmarek", 2016));

	}

	public boolean czyKsiazkaJestDostepna(String nazwkaKsiazki) {
		for (Ksiazka ksiazka : listaKsiazek) {
			if (ksiazka.getNazwa().equals(nazwkaKsiazki)) {
				return ksiazka.isDostepna();
			}

		}
		return false;
	}

	public Ksiazka wypozyczKsiazke(String nazwkaKsiazki) {
		for (Ksiazka ksiazka : listaKsiazek) {
			if (ksiazka.getNazwa().equals(nazwkaKsiazki) && ksiazka.isDostepna() == true) {
				ksiazka.setDostepna(false);
				return ksiazka;
			}

		}
		System.out.println("ksiazka nie jest dostepna");
		return null;
	}

	public void wyswietlWypozyczoneKsaiazki() {
		for (Ksiazka ksiazka : listaKsiazek) {
			if (ksiazka.isDostepna() == false) {
				System.out.println(ksiazka.toString());
			}
		}
	}

	public void wyswietlDostepneKsiazki() {
		for (Ksiazka ksiazka : listaKsiazek) {
			if (ksiazka.isDostepna() == true) {
				System.out.println(ksiazka.toString());
			}
		}
	}

	public void oddajKsiazke(String nazwkaKsiazki) {
		for (Ksiazka ksiazka : listaKsiazek) {
			if (ksiazka.getNazwa().equals(nazwkaKsiazki) && ksiazka.isDostepna() == false) {
				ksiazka.setDostepna(true);
			}
		}
	}

}
