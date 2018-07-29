package zadaniaDomowe.obiektowosc;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Wydarzenie {

	String nazwaWydarzenia;
	MojaData dataWydarzenia;

	public Wydarzenie(String nazwaWydarzenia, int dzien, int miesiac, int rok) {
		dataWydarzenia = new MojaData(dzien, miesiac, rok);
		this.nazwaWydarzenia = nazwaWydarzenia;
	}

	public int ilePozostaloDni() {
		LocalDate wydarzenie = dataWydarzenia.oddajDate();

		int dni = (int) ChronoUnit.DAYS.between(LocalDate.now(), wydarzenie);
		return dni;
	}

	public int ilePozostaloLat() {
		LocalDate wydarzenie = dataWydarzenia.oddajDate();

		int lata = (int) ChronoUnit.YEARS.between(LocalDate.now(), wydarzenie);
		return lata;
	}

	public int ilePozostaloMiesiecy() {
		LocalDate wydarzenie = dataWydarzenia.oddajDate();

		int miesiace = (int) ChronoUnit.MONTHS.between(LocalDate.now(), wydarzenie);
		return miesiace;
	}

}
