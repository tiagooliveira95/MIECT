package aula2.ex2;

public class Coordinates {
	private final int x1;
	private final int y1;

	private final int x2;
	private final int y2;

	public Coordinates(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	@Override
	public String toString() {
		return "x1=" + (x1 + 1) +
				", y1=" + (y1 +1) +
				", x2=" + (x2 +1) +
				", y2=" + (y2 +1);
	}
}
