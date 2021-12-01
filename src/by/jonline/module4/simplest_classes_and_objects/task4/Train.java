package by.jonline.module4.simplest_classes_and_objects.task4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Train {

	private String destination;
	private int number;
	private Calendar date;

	public Train() {
		destination = "";
		this.date = new GregorianCalendar();
	}

	public Train(String destination, int number, Calendar date) {

		this.destination = destination;
		this.number = number;
		this.date = date;

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

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " destination: " + destination + " number: " + number + " date: "
				+ date.getTime();
	}

	@Override
	public int hashCode() {
		int hash0 = 0;
		int hash1 = 0;

		if (date != null) {
			hash0 = date.hashCode();
		}

		if (destination != null) {
			hash1 = destination.hashCode();
		}
		return (int) (31 * number + hash0 + hash1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Train other = (Train) obj;

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

		if (number != other.number) {
			return false;
		}

		if (date == null) {

			if (other.date != null) {
				return false;
			}

		} else if (!date.equals(other.date)) {
			return false;
		}

		return true;
	}

}