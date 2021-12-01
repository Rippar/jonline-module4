package by.jonline.module4.simplest_classes_and_objects.task10;

import by.jonline.module4.simplest_classes_and_objects.task6.Time;

public class UserActionController {

	private AirlineDepartureBoard departureBoard = new AirlineDepartureBoard();
	private AirlineLogic logic = new AirlineLogic();
	private AirlineView view = new AirlineView();

	public void uploadInfoToDepartureBoard() {
		Airline[] airliners = logic.getAirlinesFromDatabase();
		departureBoard.addAirlinesToDepartureBoard(airliners);
		view.printNotification("Список рейсов загружен в табло вылета.");
	}

	public void getInfoByDestination(String destination) {
		Airline[] airliners = departureBoard.getAirliners();
		Airline[] selection = logic.findByDestination(destination, airliners);

		view.printNotification("Список рейсов для заданного пункта назначения: " + destination);
		view.printAirliners(selection);
	}

	public void getInfoByDay(String day) {
		Airline[] airliners = departureBoard.getAirliners();
		Airline[] selection = logic.findByDay(day, airliners);

		view.printNotification("Список рейсов для заданного дня недели: " + day);
		view.printAirliners(selection);
	}

	public void getInfoByDayAndTime(String day, Time time) {
		Airline[] airliners = departureBoard.getAirliners();
		Airline[] selection = logic.findByDayAndTime(day, time, airliners);

		view.printNotification("Список рейсов для заданного дня недели: " + day
				+ ", время вылета для которых больше заданного: " + time.getHour() + ":" + time.getMinute());
		view.printAirliners(selection);

	}

	public void getAirliners() {
		Airline[] airliners = departureBoard.getAirliners();
		view.printAirliners(airliners);
	}


}
