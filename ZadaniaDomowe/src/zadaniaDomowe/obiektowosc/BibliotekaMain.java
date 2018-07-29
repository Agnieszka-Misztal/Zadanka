package zadaniaDomowe.obiektowosc;

public class BibliotekaMain {

	public static void main(String[] args) {

		Biblioteka bibl = new Biblioteka();

		System.out.println(bibl.czyKsiazkaJestDostepna("Igor w Chinach"));
		bibl.wypozyczKsiazke("Igor w Chinach");
		System.out.println(bibl.czyKsiazkaJestDostepna("Igor w Chinach"));
		System.out.println("\nDostepne:");
		bibl.wyswietlDostepneKsiazki();
		System.out.println("\nWypożyczone:");
		bibl.wyswietlWypozyczoneKsaiazki();
		bibl.oddajKsiazke("Igor w Chinach");
		System.out.println("\nDostepne");
		bibl.wyswietlDostepneKsiazki();

	}

}
