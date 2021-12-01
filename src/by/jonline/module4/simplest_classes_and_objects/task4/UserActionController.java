package by.jonline.module4.simplest_classes_and_objects.task4;

public class UserActionController {
	
	private UserDataInput input = new UserDataInput();
	private TrainView view = new TrainView();
	private TrainLogic logic = new TrainLogic();

	public void getInfoByNumber() {
		Train[] trains;
		Train train;
		int number;

		trains = logic.getTrainsFromSchedule();
		view.printTrainNumbers(trains);

		number = input.enterFromConsole("Введите номер поезда для получения информации: ");
		train = logic.findByNumber(number, trains);

		if (train != null) {
			view.printTrain(train);

		} else {
			view.printErrorMessage("Поезд с номером " + number + " не найден");
		}

		System.out.println();

	}


	public void getTrains() {
		Train[] trains = logic.getTrainsFromSchedule();
		view.printTrains(trains);
	}

	public void getSortedTrainsByNumber() {
		Train[] trains = logic.getTrainsFromSchedule();
		logic.sortByNumber(trains);
		view.printTrains(trains);
	}

	public void getSortedTrainsByDestination() {
		Train[] trains = logic.getTrainsFromSchedule();
		logic.sortByDestination(trains);
		view.printTrains(trains);
	}

}
