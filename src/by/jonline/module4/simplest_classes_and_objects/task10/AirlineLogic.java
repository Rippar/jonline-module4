package by.jonline.module4.simplest_classes_and_objects.task10;

import by.jonline.module4.simplest_classes_and_objects.task6.Time;

public class AirlineLogic {
	
	public Airline[] getAirlinesFromDatabase() {
		AirlineDatabase database = new AirlineDatabase();
		return database.getSchedule();
	}

	public Airline[] findByDestination(String destination, Airline[] airliners) {

		int size = 0;
		int[] positions = new int[airliners.length];

		for (int i = 0; i < airliners.length; i++) {

			if (airliners[i].getDestination().equalsIgnoreCase(destination)) {
				size++;
				positions[i]++;
			}
		}

		Airline[] selection = getSelectionArray(airliners, positions, size);

		return selection;
	}

	public Airline[] findByDay(String day, Airline[] airliners) {

		int size = 0;
		int[] positions = new int[airliners.length];

		for (int i = 0; i < airliners.length; i++) {

			String[] departureDays = airliners[i].getDays();

			for (int j = 0; j < departureDays.length; j++) {

				if (departureDays[j].equalsIgnoreCase(day)) {
					size++;
					positions[i]++;
					break;
				}
			}

		}

		Airline[] selection = getSelectionArray(airliners, positions, size);

		return selection;
	}

	public Airline[] findByDayAndTime(String day, Time time, Airline[] airliners) {

		int time1 = time.convertToSec();
		int size = 0;
		int[] positions = new int[airliners.length];

		for (int i = 0; i < airliners.length; i++) {

			int time2 = airliners[i].getDepartureTime().convertToSec();

			String[] departureDays = airliners[i].getDays();

			for (int j = 0; j < departureDays.length; j++) {

				if (departureDays[j].equalsIgnoreCase(day) && time2 > time1) {
					size++;
					positions[i]++;
					break;
				}

			}
		}

		Airline[] selection = getSelectionArray(airliners, positions, size);

		return selection;
	}

	private Airline[] getSelectionArray(Airline[] airliners, int[] positions, int size) {

		int k = 0;
		Airline[] selection = new Airline[size];

		for (int i = 0; i < positions.length; i++) {
			if (positions[i] == 1) {
				selection[k++] = airliners[i];
			}
		}

		return selection;
	}

}
