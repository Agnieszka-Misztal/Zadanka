package zadaniaDomowe.obiektowosc;

import java.text.ParseException;

public class DatyMain {

	public static void main(String[] args) throws ParseException {

		MojaData datka = new MojaData(12, 11, 2005);

		datka.wyswietlDate1();
		datka.wyswietlDate2();
		datka.wyswietlDate3();

		Wydarzenie wyd = new Wydarzenie("coś", 31, 7, 2019);
		System.out.println(wyd.ilePozostaloDni());
		System.out.println(wyd.ilePozostaloLat());
		System.out.println(wyd.ilePozostaloMiesiecy());

	}

}
