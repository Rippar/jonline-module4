package by.jonline.module4.aggregation_and_composition.task2;

public class Garage {

	private Car bmw = new Car("BMW", 2006, 18, new Engine(3000, 258));

	private Car mercedes = new Car("Mercedes", 2005, 19, new Engine(2500, 230));

	private Car tesla = new Car("Tesla", 2020, 19, new Engine(0, 440));

	public Car[] getCars() {
		return new Car[] { bmw, mercedes, tesla };
	}

}
