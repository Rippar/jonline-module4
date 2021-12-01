package by.jonline.module4.aggregation_and_composition.task2;


public class Car {

	private static final int NUM_OF_WHEELS = 4;

	private String model;

	private int year;

	private Wheel[] wheels = new Wheel[NUM_OF_WHEELS];

	private Engine engine;

	private int currentSpeed;

	private int fuelLevel;

	public Car() {
		model = "";

		for (int i = 0; i < NUM_OF_WHEELS; i++) {
			wheels[i] = new Wheel();
		}

		engine = new Engine();

	}

	public Car(String model, int year, int wheelSize, Engine engine) {

		this.model = model;

		this.year = year;

		for (int i = 0; i < NUM_OF_WHEELS; i++) {
			wheels[i] = new Wheel(wheelSize);
		}

		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentSpeed;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + fuelLevel;
		result = prime * result + ((model == null) ? 0 : model.hashCode());

		if (wheels != null) {

			for (int i = 0; i < wheels.length; i++) {
				if (wheels[i] != null) {
					result = prime * result + wheels[i].hashCode();

				} else {
					result = prime * result + 0;
				}
			}
		}

		result = prime * result + year;
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
		Car other = (Car) obj;
		if (currentSpeed != other.currentSpeed)
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (fuelLevel != other.fuelLevel)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;

		if (this.wheels != null && other.wheels != null) {
			if (this.wheels.length != other.wheels.length) {
				return false;
			}

			for (int i = 0; i < wheels.length; i++) {
				if (!this.wheels[i].equals(other.wheels[i])) {
					return false;
				}
			}

		} else if (this.wheels == null) {
			if (other.wheels != null) {
				return false;
			}

		} else if (other.wheels == null) {
			if (this.wheels != null) {
				return false;
			}
		}

		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "model=" + model + ", year=" + year + ", wheels=" + wheels + ", engine="
				+ engine + ", currentSpeed=" + currentSpeed + ", fuelLevel=" + fuelLevel;
	}

}