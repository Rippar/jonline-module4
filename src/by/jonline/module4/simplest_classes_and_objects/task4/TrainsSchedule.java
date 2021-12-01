package by.jonline.module4.simplest_classes_and_objects.task4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TrainsSchedule {

	private Train tr0 = new Train("Brest", 112, new GregorianCalendar(2022, Calendar.MARCH, 16, 19, 17));
	private Train tr1 = new Train("Gomel", 84, new GregorianCalendar(2022, Calendar.MARCH, 16, 12, 30));
	private Train tr2 = new Train("Grodno", 99, new GregorianCalendar(2022, Calendar.MARCH, 17, 19, 45));
	private Train tr3 = new Train("Vitebsk", 58, new GregorianCalendar(2022, Calendar.MARCH, 16, 9, 30));
	private Train tr4 = new Train("Grodno", 77, new GregorianCalendar(2022, Calendar.MARCH, 17, 20, 36));

	public Train[] getTrains() {
		return new Train[] { tr0, tr1, tr2, tr3, tr4 };
	}

}
