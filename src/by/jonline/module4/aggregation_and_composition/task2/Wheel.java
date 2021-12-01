package by.jonline.module4.aggregation_and_composition.task2;

public class Wheel {

	private static final int DEFAULT_WHEEL_SIZE = 16;

	private final int size;
	private double pressure;

	public Wheel() {
		size = DEFAULT_WHEEL_SIZE;
	}

	public Wheel(int size) {
		this.size = size;
	}

	public Wheel(int size, double pressure) {
		this.size = size;
		this.pressure = pressure;
	}

	public int getSize() {
		return size;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(pressure);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (Double.doubleToLongBits(pressure) != Double.doubleToLongBits(other.pressure))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "size= " + size + ", pressure=" + pressure;
	}

}