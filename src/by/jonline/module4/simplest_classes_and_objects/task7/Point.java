package by.jonline.module4.simplest_classes_and_objects.task7;

public class Point {

	private double x;
	private double y;
	
	Point() {
	}

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distanceTo(Point point) {
		double tmp = Math.pow(point.getX() - x, 2);
		tmp += Math.pow(point.getY() - y, 2);
		return Math.sqrt(tmp);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " x=" + x + ", y=" + y;
	}

	@Override
	public int hashCode() {
		return (int) (31 * x + y);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Point other = (Point) obj;

		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

}
