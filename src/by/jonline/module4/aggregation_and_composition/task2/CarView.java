package by.jonline.module4.aggregation_and_composition.task2;

public class CarView {

	public void printCarModel(Car car) {
		System.out.println(car.getModel());
	}

	public void printCar(Car car) {
		System.out.println("Модель: " + car.getModel() + "\nГод выпуска: " + car.getYear() + "\nДиаметр колес: "
				+ car.getWheels()[0].getSize() + "\nОбъем двигателя: " + car.getEngine().getCapacity()
				+ "\nМощность двигателя: " + car.getEngine().getPower() + "\nТекущая скорость: " + car.getCurrentSpeed()
				+ "\nУровень топлива: " + car.getFuelLevel());
	}

}
