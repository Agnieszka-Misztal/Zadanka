package zadaniaDomowe.obiektowosc;

public class Ksiazka {
	String nazwa;
	String autor;
	int rokWydania;
	boolean dostepna;

	public Ksiazka(String nazwa, String autor, int rokWydania) {
		super();
		this.nazwa = nazwa;
		this.autor = autor;
		this.rokWydania = rokWydania;
		dostepna = true;
	}

	@Override
	public String toString() {
		return "Tytul : \"" + nazwa + "\", " + autor + " " + rokWydania;
	}

	public boolean isDostepna() {
		return dostepna;
	}

	public String getNazwa() {
		return nazwa;
	}

	public String getAutor() {
		return autor;
	}

	public void setDostepna(boolean dostepna) {
		this.dostepna = dostepna;
	}

}
