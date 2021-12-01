package by.jonline.module4.simplest_classes_and_objects.task6;


public class Time {

	private int h;
	private int m;
	private int s;

	public Time() {
	}

	public Time(int hour, int minute, int second) {

		if (hour < 24 && hour > 0) {
			h = hour;
		}

		if (minute < 60 && minute > 0) {
			m = minute;
		}

		if (second < 60 && second > 0) {
			s = second;
		}

	}

	public Time(int hour, int minute) {

		if (hour < 24 && hour > 0) {
			h = hour;
		}

		if (minute < 60 && minute > 0) {
			m = minute;
		}

	}

	public Time(int hour) {

		if (hour < 24 && hour > 0) {
			h = hour;
		}

	}

	public void changeHour(int hour) {

		if (hour < 24 && hour > -24) {

			int newTime = convertToSec(h + hour, m, s);
			int[] tmp = convertFromSec(newTime);

			h = tmp[0];
			m = tmp[1];
			s = tmp[2];

		} else {

			System.out.println("Изменить значение часов можно только в интервале от -24ч до 24ч!");
			h = 0;
		}
	}

	public void changeMinute(int minute) {

		if (minute < 60 && minute > -60) {

			int newTime = convertToSec(h, m + minute, s);
			int[] tmp = convertFromSec(newTime);

			h = tmp[0];
			m = tmp[1];
			s = tmp[2];

		} else {

			System.out.println("Изменить значение минут можно только в интервале от -60 мин  до 60 мин!");
			m = 0;

		}

	}

	public void changeSecond(int second) {

		if (second < 60 && second > -60) {

			int newTime = convertToSec(h, m, s + second);
			int[] tmp = convertFromSec(newTime);

			h = tmp[0];
			m = tmp[1];
			s = tmp[2];

		} else {
			System.out.println("Изменить значение секунд можно только в интервале от -60 сек  до 60 сек!");
			s = 0;
		}

	}

	private int convertToSec(int hour, int min, int sec) {
		return sec + min * 60 + hour * 60 * 60;
	}

	public int convertToSec() {
		return s + m * 60 + h * 60 * 60;
	}

	// вспомогательный метод для конвертирования секунд во время формата 24h
	// hh:mm:ss
	private int[] convertFromSec(int seconds) {
		if (seconds < 0) {
			seconds = 86400 + seconds;
		}

		int hour = seconds / 3600;
		int min = seconds / 60 - hour * 60;
		int sec = seconds - ((hour * 3600) + (min * 60));

		if (hour == 24) {
			hour = 0;
		}

		return new int[] { hour, min, sec };
	}

	public int getHour() {
		return h;
	}

	public int getMinute() {
		return m;
	}

	public int getSecond() {
		return s;
	}

	@Override
	public String toString() {

		String time = " " + h + "h:" + m + "m:" + s + "s";

		return getClass().getSimpleName() + time;
	}

	@Override
	public int hashCode() {
		return 31 * h + m + s;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Time other = (Time) obj;

		return h == other.h && m == other.m && s == other.s;
	}

}
