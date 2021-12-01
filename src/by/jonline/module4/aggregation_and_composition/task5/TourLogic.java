package by.jonline.module4.aggregation_and_composition.task5;

public class TourLogic {

	public Tour[] getToursFromDatabase() {
		TravelAgencyDatabase database = new TravelAgencyDatabase();
		return database.getTours();
	}

	public void sortToursByPrice(Tour[] tours) {
		for (int i = tours.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (tours[i].getPrice() < tours[j].getPrice()) {
					Tour tmp = tours[i];
					tours[i] = tours[j];
					tours[j] = tmp;
				}
			}
		}
	}

	public void sortToursByDays(Tour[] tours) {
		for (int i = tours.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (tours[i].getNumOfDays() < tours[j].getNumOfDays()) {
					Tour tmp = tours[i];
					tours[i] = tours[j];
					tours[j] = tmp;
				}
			}
		}
	}

	public Tour[] findTour(String transport, boolean allInclusive, int days, double minCost, double maxCost,
			Tour[] tours) {

		int[] positions = new int[tours.length];
		int size = 0;

		for (int i = 0; i < tours.length; i++) {

			if (tours[i].getTransport().equalsIgnoreCase(transport) && tours[i].isAllInclusive() == allInclusive
					&& tours[i].getNumOfDays() == days && minCost <= tours[i].getPrice()
					&& tours[i].getPrice() <= maxCost) {

				positions[i]++;
				size++;
			}

		}

		Tour[] selection = getSelectionArray(tours, positions, size);

		return selection;

	}

	private Tour[] getSelectionArray(Tour[] tours, int[] positions, int size) {

		int k = 0;
		Tour[] selection = new Tour[size];

		for (int i = 0; i < positions.length; i++) {
			if (positions[i] == 1) {
				selection[k++] = tours[i];
			}
		}

		return selection;
	}

}
