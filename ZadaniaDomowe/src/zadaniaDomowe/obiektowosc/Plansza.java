package zadaniaDomowe.obiektowosc;

public class Plansza {

	public static double obliczOdleglosc(Punkt a, Punkt b) {
		return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
	}

}
