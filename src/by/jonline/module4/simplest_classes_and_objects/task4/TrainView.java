package by.jonline.module4.simplest_classes_and_objects.task4;

public class TrainView {

	public void printTrainNumbers(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			System.out.printf("Поезд №%d\n", trains[i].getNumber());
		}
		System.out.println();
	}

	public void printTrains(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			printTrain(trains[i]);
		}
		System.out.println();
	}

	public void printTrain(Train train) {
		System.out.println("№ поезда: " + train.getNumber() + "; Направление: " + train.getDestination()
				+ "; Дата отправления: " + train.getDate().getTime());
	}

	public void printErrorMessage(String message) {
		System.out.println(message);
	}

}
