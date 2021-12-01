package by.jonline.module4.simplest_classes_and_objects.task4;

public class TrainLogic {
	
	public Train[] getTrainsFromSchedule() {
		TrainsSchedule schedule = new TrainsSchedule();
		return schedule.getTrains();
	}

	public Train findByNumber(int number, Train[] trains) {
		for (int i = 0; i < trains.length; i++) {

			if (number == trains[i].getNumber()) {
				return (trains[i]);
			}
		}
		return null;
	}


	public void sortByNumber(Train[] trains) {

		for (int i = trains.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (trains[i].getNumber() < trains[j].getNumber()) {
					Train tmp = trains[i];
					trains[i] = trains[j];
					trains[j] = tmp;
				}
			}
		}
	}

	public void sortByDestination(Train[] trains) {

		for (int i = trains.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				int result = trains[i].getDestination().compareToIgnoreCase(trains[j].getDestination());

				if (result < 0) {
					Train tmp = trains[i];
					trains[i] = trains[j];
					trains[j] = tmp;
				}

				if (result == 0) {
					// осуществляем сортировку по времени отправления для поездов с
					// одинаковыми пунктами назначения
					if (trains[i].getDate().before(trains[j].getDate())) {

						Train tmp = trains[i];
						trains[i] = trains[j];
						trains[j] = tmp;

					}
				}
			}
		}
	}

}