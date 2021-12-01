package by.jonline.module4.aggregation_and_composition.task2;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
*/

public class CarRunner {

	public static void main(String[] args) {

		UserActionController action = new UserActionController();

		action.chooseCarFromGarage("bmw");
		
		action.refuel(60);
		action.drive(120);
		action.changeWheel();

		action.getModelInfo();
		action.getCarInfo();

	}

}
