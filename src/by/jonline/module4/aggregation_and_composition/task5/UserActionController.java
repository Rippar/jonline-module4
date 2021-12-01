package by.jonline.module4.aggregation_and_composition.task5;

public class UserActionController {

	private TourLogic logic = new TourLogic();
	private TourView view = new TourView();

	public void getTours() {
		view.printNotification("Список всех путевок: ");
		view.printTours(logic.getToursFromDatabase());
	}

	public void getToursSortedByDays() {
		Tour[] tours = logic.getToursFromDatabase();

		logic.sortToursByDays(tours);
		view.printNotification("Список всех путевок, отсортированных по количеству дней:  ");
		view.printTours(tours);
	}

	public void getToursSortedByPrice() {

		Tour[] tours = logic.getToursFromDatabase();

		logic.sortToursByPrice(tours);
		view.printNotification("Список всех путевок, отсортированных по стоимости: ");
		view.printTours(tours);
	}

	public void getToursByParam(String transport, boolean allInclusive, int days, double minCost, double maxCost) {

		Tour[] tours = logic.getToursFromDatabase();

		Tour[] selection = logic.findTour(transport, allInclusive, days, minCost, maxCost, tours);

		if (selection.length > 0) {
			view.printNotification("Список всех путевок по заданным параметрам:  ");
			view.printTours(selection);
		} else {
			view.printNotification("Не найдено путевок по заданным параметрам.");
		}
	}

}
