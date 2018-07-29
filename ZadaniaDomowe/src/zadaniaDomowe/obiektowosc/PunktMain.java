package zadaniaDomowe.obiektowosc;

public class PunktMain {

	public static void main(String[] args) {

		Punkt a = new Punkt();
		Punkt b = new Punkt();
		b.setX(5);
		b.setY(9);

		System.out.println(Plansza.obliczOdleglosc(a, b));

	}

}
