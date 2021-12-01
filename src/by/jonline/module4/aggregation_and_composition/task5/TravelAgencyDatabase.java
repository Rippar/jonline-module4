package by.jonline.module4.aggregation_and_composition.task5;

public class TravelAgencyDatabase {

	private Tour vacation0 = new Tour("Отдых", "Египет", "Самолет", true, 10, 499.99);
	private Tour vacation1 = new Tour("Отдых", "Турция", "Самолет", true, 12, 459.00);
	private Tour vacation2 = new Tour("Отдых", "Греция", "Самолет", false, 12, 510.49);

	private Tour excursion0 = new Tour("Экскурсия", "Украина", "Автобус", false, 7, 249.00);
	private Tour excursion1 = new Tour("Экскурсия", "Латвия", "Поезд", false, 5, 299.00);
	private Tour excursion2 = new Tour("Экскурсия", "Польша", "Автобус", true, 5, 375.00);

	private Tour treatment0 = new Tour("Лечение", "Чехия", "Самолет", true, 16, 1500.00);
	private Tour treatment1 = new Tour("Лечение", "Россия", "Поезд", false, 6, 290.00);
	private Tour treatment2 = new Tour("Лечение", "Литва", "Поезд", false, 7, 485.50);

	private Tour shopping0 = new Tour("Шоппинг", "Литва", "Автобус", false, 3, 100.00);
	private Tour shopping1 = new Tour("Шоппинг", "Польша", "Автобус", false, 4, 150.00);
	private Tour shopping2 = new Tour("Шоппинг", "Россия", "Автобус", false, 7, 220.00);

	private Tour cruise0 = new Tour("Круиз", "Тайланд", "Самолет", true, 14, 1400.00);
	private Tour cruise1 = new Tour("Круиз", "Испания", "Самолет", true, 15, 1300.00);
	private Tour cruise2 = new Tour("Круиз", "Греция", "Самолет", true, 16, 1450.00);

	public Tour[] getTours() {

		return new Tour[] { vacation0, vacation1, vacation2, excursion0, excursion1, excursion2, treatment0,
						treatment1, treatment2, shopping0, shopping1, shopping2, cruise0, cruise1, cruise2 };
	}

}
