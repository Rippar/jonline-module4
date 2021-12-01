package by.jonline.module4.simplest_classes_and_objects.task10;

public class AirlineDepartureBoard {

	private Airline[] airliners;
	private int capacity;
	private int size;

	AirlineDepartureBoard(int capacity) {
		airliners = new Airline[capacity];
		this.capacity = capacity;
		size = 0;
	}

	AirlineDepartureBoard() {
		this(3);
	}

	public void addAirlineToTimetable(Airline airline) {
		if (size < capacity) {
			airliners[size++] = airline;

		} else {
			Airline[] newAirliners = new Airline[++capacity];

			for (int i = 0; i < size; i++) {
				newAirliners[i] = airliners[i];
			}

			newAirliners[size] = airline;
			size = capacity;
			airliners = newAirliners;
		}
	}

	public void addAirlinesToDepartureBoard(Airline[] inputAirliners) {
		int newSize = size + inputAirliners.length;

		if (newSize < capacity) {
			for (int i = 0; i < inputAirliners.length; i++) {
				airliners[size++] = inputAirliners[i];
			}

		} else {
			capacity = size + inputAirliners.length;
			Airline[] newAirliners = new Airline[capacity];

			for (int i = 0; i < size; i++) {
				newAirliners[i] = airliners[i];
			}

			for (int i = 0; i < inputAirliners.length; i++) {
				newAirliners[size++] = inputAirliners[i];
			}

			airliners = newAirliners;
		}
	}

	public Airline[] getAirliners() {
		Airline[] outputAirliners = new Airline[size];

		for (int i = 0; i < size; i++) {
			outputAirliners[i] = airliners[i];
		}
		return outputAirliners;

	}

}
