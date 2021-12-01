package by.jonline.module4.simplest_classes_and_objects.task10;

import by.jonline.module4.simplest_classes_and_objects.task6.Time;

public class AirlineDatabase {
	private Airline a0 = new Airline("Moscow", 2951, "Boeing 737-800", new Time(15, 15),
			new String[] { "Monday", "Wednesday" });

	private Airline a1 = new Airline("Antaliya", 28191, "Boeing 737-800", new Time(11, 50),
			new String[] { "Monday", "Saturday" });

	private Airline a2 = new Airline("Antaliya", 28105, "Boeing 737-800", new Time(4, 15), new String[] { "Tuesday" });

	private Airline a3 = new Airline("Bodrum", 28129, "Boeing 737-800", new Time(5, 30), new String[] { "Tuesday" });

	private Airline a4 = new Airline("Tbilisi", 2735, "Boeing 737-300", new Time(22, 50),
			new String[] { "Tuesday", "Friday", "Sunday" });

	private Airline a5 = new Airline("Yerevan", 2733, "Embraer 175", new Time(22, 40),
			new String[] { "Thursday", "Sunday" });

	public Airline[] getSchedule() {
		return new Airline[] { a0, a1, a2, a3, a4, a5 };
	}

}
