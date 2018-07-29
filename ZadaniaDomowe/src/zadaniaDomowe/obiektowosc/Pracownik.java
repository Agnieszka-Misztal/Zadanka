package zadaniaDomowe.obiektowosc;

public class Pracownik {

	String imie;
	String nazwisko;
	float miesieczneWynagrodzenie;

	public Pracownik(String imie, String nazwisko, float miesieczneWynagrodzenie) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.miesieczneWynagrodzenie = miesieczneWynagrodzenie;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public float getMiesieczneWynagrodzenie() {
		return miesieczneWynagrodzenie;
	}

	public void setMiesieczneWynagrodzenie(float miesieczneWynagrodzenie) {
		this.miesieczneWynagrodzenie = miesieczneWynagrodzenie;
	}

}
