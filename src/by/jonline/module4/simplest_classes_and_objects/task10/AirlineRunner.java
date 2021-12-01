package by.jonline.module4.simplest_classes_and_objects.task10;

import by.jonline.module4.simplest_classes_and_objects.task6.Time;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, 
set - и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline,
с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные 
на консоль.

    Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
    Найти и вывести:
    a) список рейсов для заданного пункта назначения;
    b) список рейсов для заданного дня недели;
    c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

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
