package by.jonline.module4.aggregation_and_composition.task3;

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры*/

public class CountryRunner {

	public static void main(String[] args) {

		UserActionController action = new UserActionController();

		action.getCountryName();
		action.getCapital();
		action.getNumOfRegions();
		action.getSquare();
		action.getRegionsCenter();

	}

}
