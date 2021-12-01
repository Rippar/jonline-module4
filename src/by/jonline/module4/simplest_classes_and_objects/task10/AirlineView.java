package by.jonline.module4.simplest_classes_and_objects.task10;

public class AirlineView {

	public void printAirline(Airline airline) {
		StringBuilder result = new StringBuilder("Пункт назначения: " + airline.getDestination() + "\nНомер рейса: "
				+ airline.getNumber() + "\nТип самолета: " + airline.getAircraft() + "\nВремя вылета: "
				+ airline.getDepartureTime().getHour() + ":" + airline.getDepartureTime().getMinute() + "\nДни недели: ");

		String[] days = airline.getDays();

		for (int i = 0; i < days.length; i++) {
			result.append(days[i]);
			result.append(" ");

		}
		System.out.println(result + "\n");
	}

	public void printAirliners(Airline[] airliners) {
		for (int i = 0; i < airliners.length; i++) {
			printAirline(airliners[i]);
		}
	}

	public void printNotification(String notification) {
		System.out.println(notification + "\n");
	}

}
