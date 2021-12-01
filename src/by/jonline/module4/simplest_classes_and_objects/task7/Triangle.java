package by.jonline.module4.simplest_classes_and_objects.task7;


public class Triangle {

	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {

		if (a != null && b != null && c != null && isValidTriangle(a, b, c)) {

			this.a = a;
			this.b = b;
			this.c = c;

		} else {
			
			//присваиваем значения по умолчанию в случае, если треугольника с заданными параметрами не существует

			this.a = new Point(0.0, 0.0);
			this.b = new Point(0.0, 0.0);
			this.c = new Point(0.0, 0.0);
		}
	}

	public boolean isValidTriangle(Point a, Point b, Point c) {

		double sideAB = a.distanceTo(b);

		double sideBC = b.distanceTo(c);

		double sideAC = a.distanceTo(c);

		return (sideAB + sideBC > sideAC && sideAB + sideAC > sideBC && sideBC + sideAC > sideAB);

	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public Point getC() {
		return c;
	}

	public double getSideAB() {
		return a.distanceTo(b);
	}

	public double getSideBC() {
		return b.distanceTo(c);
	}

	public double getSideAC() {
		return a.distanceTo(c);
	}

	public double getPerimeter() {
		return getSideAB() + getSideBC() + getSideAC();
	}

	public double getArea() {
		double p = getPerimeter() / 2.;
		return Math.sqrt(p * (p - getSideAB()) * (p - getSideBC()) * (p - getSideAC()));
	}

	public Point getCenter() {

		double x = (a.getX() + b.getX() + c.getX()) / 3;
		double y = (a.getY() + b.getY() + c.getY()) / 3;

		return new Point(x, y);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " a=" + a + ", b=" + b + ", c=" + c;
	}

	@Override
	public int hashCode() {
		int hash0 = 0;
		int hash1 = 0;
		int hash2 = 0;

		if (a != null) {
			hash0 = a.hashCode();
		}

		if (b != null) {
			hash1 = b.hashCode();
		}

		if (c != null) {
			hash2 = c.hashCode();
		}
		return hash0 + hash1 + hash2;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Triangle other = (Triangle) obj;

		return a.equals(other.getA()) && b.equals(other.getB()) && c.equals(other.getC());
	}

}
