package by.jonline.module4.simplest_classes_and_objects.task10;

import by.jonline.module4.simplest_classes_and_objects.task6.Time;

public class AirlineRunner {

	public static void main(String[] args) {

		UserActionController action = new UserActionController();

		action.uploadInfoToDepartureBoard();
		action.getAirliners();
		action.getInfoByDestination("Antaliya");
		action.getInfoByDay("Monday");
		action.getInfoByDayAndTime("Sunday", new Time(22, 30));

	}

}
