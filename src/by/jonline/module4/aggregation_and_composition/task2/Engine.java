package by.jonline.module4.aggregation_and_composition.task2;

public class Engine {

	private double capacity;
	private int power;

	public Engine() {

	}

	public Engine(double capacity, int power) {

		this.capacity = capacity;
		this.power = power;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(capacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + power;
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
		Engine other = (Engine) obj;
		if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
			return false;
		if (power != other.power)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "capacity= " + capacity + ", power= " + power;
	}

}