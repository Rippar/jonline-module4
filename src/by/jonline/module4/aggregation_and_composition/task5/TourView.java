package by.jonline.module4.aggregation_and_composition.task5;

public class TourView {

	public void printTour(Tour tour) {
		System.out.println(
				"Тип путевки: " + tour.getTypeOfTour() + "\nСтрана: " + tour.getCountry() + "\nТип транспорта: "
						+ tour.getTransport() + "\nПитание включено?: " + (tour.isAllInclusive() ? "да" : "нет")
						+ "\nКоличество дней: " + tour.getNumOfDays() + "\nСтоимость: " + tour.getPrice() + "\n");
	}

	public void printTours(Tour[] tours) {
		for (int i = 0; i < tours.length; i++) {
			printTour(tours[i]);
		}
	}

	public void printNotification(String message) {
		System.out.println(message + "\n");
	}

}
