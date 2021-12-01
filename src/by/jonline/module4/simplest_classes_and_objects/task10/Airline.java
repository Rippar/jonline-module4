package by.jonline.module4.simplest_classes_and_objects.task10;

import by.jonline.module4.simplest_classes_and_objects.task6.Time;

public class Airline {

	private String destination;
	private int number;
	private String aircraft;
	private Time departureTime;
	private String[] days;

	public Airline() {

		destination = "";
		aircraft = "";
		departureTime = new Time(00, 00, 00);
		days = new String[] { "" };
	}

	public Airline(String destination, int number, String aircraft, Time departureTime, String[] days) {

		this.destination = destination;
		this.number = number;
		this.aircraft = aircraft;
		this.departureTime = departureTime;
		this.days = days;

	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAircraft() {
		return aircraft;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public String[] getDays() {
		return days;
	}

	public void setDays(String[] days) {
		this.days = days;
	}

	public String toString() {

		StringBuilder result = new StringBuilder("\ndestination " + destination + "\nnumber: " + number + "\naircraft: "
				+ aircraft + "\ntime: " + departureTime + "\ndepartureDays ");

		for (int i = 0; i < days.length; i++) {
			result.append(days[i]);
			result.append(" ");

		}

		return getClass().getSimpleName() + result;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + (aircraft == null ? 0 : aircraft.hashCode());
		result = prime * result + (departureTime == null ? 0 : departureTime.hashCode());
		result = prime * result + (destination == null ? 0 : destination.hashCode());

		for (String day : days) {
			if (day != null) {
				result = prime * result + day.hashCode();
			} else {
				result = prime * result + 0;
			}
		}

		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Airline other = (Airline) obj;

		if (aircraft == null) {
			if (other.aircraft != null) {
				return false;
			}

		} else if (!aircraft.equals(other.aircraft)) {
			return false;
		}

		if (this.days == null) {
			if (other.days != null) {
				return false;
			}
		}

		if (this.days != null && other.days != null) {

			if (this.days.length != other.days.length) {
				return false;
			}

			for (int i = 0; i < this.days.length; i++) {

				if (this.days[i] == null) {
					if (other.days[i] != null) {
						return false;
					}

				} else if (!this.days[i].equals(other.days[i])) {
					return false;
				}
			}

		} else if (this.days == null) {
			if (other.days != null) {
				return false;
			}

		} else if (other.days != null) {
			if (this.days == null) {
				return false;
			}
		}

		if (departureTime == null) {
			if (other.departureTime != null) {
				return false;
			}

		} else if (!departureTime.equals(other.departureTime)) {
			return false;
		}

		if (destination == null) {
			if (other.destination != null) {
				return false;
			}

		} else if (!destination.equals(other.destination)) {
			return false;
		}

		if (number != other.number) {
			return false;
		}

		return true;
	}

}
