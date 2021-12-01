package by.jonline.module4.aggregation_and_composition.task2;

public class CarLogic {

	public boolean drive(Car car, int speed) {
		int oldSpeed = car.getCurrentSpeed();
		int newSpeed = oldSpeed + speed;
		if (newSpeed != oldSpeed) {
			car.setCurrentSpeed(speed);
			return true;
		} else {
			return false;
		}

	}

	public boolean refuel(Car car, int amount) {
		int oldLevel = car.getFuelLevel();
		int newLevel = oldLevel + amount;

		if (newLevel > oldLevel) {
			car.setFuelLevel(newLevel);
			return true;

		} else {
			return false;
		}
	}

	public boolean changeWheel(Car car, Wheel wheel) {
		Wheel[] wheels = car.getWheels();
		boolean flag = false;

		for (int i = 0; i < wheels.length; i++) {

			if (wheels[i].getPressure() == 0.0) {

				int size = wheels[i].getSize();
				wheels[i] = new Wheel(size, 2.0);
				flag = true;
			}
		}
		return flag;
	}

	public Car findByModel(String model, Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getModel().equalsIgnoreCase(model)) {
				return cars[i];
			}
		}

		return null;
	}

}
