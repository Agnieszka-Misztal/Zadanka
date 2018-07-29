package zadaniaDomowe.obiektowosc;

public class Punkt {

	int x;
	int y;

	public Punkt() {
		this.x = 2;
		this.y = 5;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
