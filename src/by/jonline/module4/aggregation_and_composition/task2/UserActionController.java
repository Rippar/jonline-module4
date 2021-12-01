package by.jonline.module4.aggregation_and_composition.task2;

public class UserActionController {

	private CarLogic logic = new CarLogic();
	private CarView view = new CarView();
	private Car car = new Car();

	public void chooseCarFromGarage(String model) {
		Garage garage = new Garage();
		Car[] cars = garage.getCars();
		car = logic.findByModel(model, cars);

	}

	public void drive(int speed) {
		logic.drive(car, speed);
	}

	public void refuel(int amount) {
		logic.refuel(car, amount);
	}

	public void changeWheel() {
		int size = car.getWheels()[0].getSize();
		logic.changeWheel(car, new Wheel(size));
	}

	public void getModelInfo() {
		view.printCarModel(car);

	}

	public void getCarInfo() {
		view.printCar(car);
	}

}
