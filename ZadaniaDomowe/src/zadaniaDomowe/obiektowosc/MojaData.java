package zadaniaDomowe.obiektowosc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MojaData {

	int dzien;
	int miesiac;
	int rok;

	public MojaData(int dzien, int miesiac, int rok) {

		this.dzien = dzien;
		this.miesiac = miesiac;
		this.rok = rok;
	}

	public void setDzien(int dzien) {
		this.dzien = dzien;
	}

	public void setMiesiac(int miesiac) {
		this.miesiac = miesiac;
	}

	public void setRok(int rok) {
		this.rok = rok;
	}

	public void wyswietlDate1() {
		System.out.println(dzien + "." + miesiac + "." + rok);
	}

	public void wyswietlDate2() {
		System.out.printf("%02d.%d.%d%n", dzien, miesiac, rok);
	}

	public void wyswietlDate3() throws ParseException {
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		String stringData = miesiac + "/" + dzien + "/" + rok;

		Date date = (Date) format.parse(stringData);
		SimpleDateFormat datka = new SimpleDateFormat("dd.MMM.yyyy");
		String newDateString = datka.format(date);
		System.out.println(newDateString);

	}

	public LocalDate oddajDate() {
		String dzien1 = String.format("%02d", dzien);
		String miesiac1 = String.format("%02d", miesiac);
		String stringData = rok + "-" + miesiac1 + "-" + dzien1;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return LocalDate.parse(stringData, dtf);

	}
}
