package by.jonline.module4.simplest_classes_and_objects.task4;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки массива
по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.*/

public class TrainRunner {
	public static void main(String[] args) {

		UserActionController action = new UserActionController();

		action.getSortedTrainsByNumber();

		action.getSortedTrainsByDestination();

		action.getInfoByNumber();

	}

}
