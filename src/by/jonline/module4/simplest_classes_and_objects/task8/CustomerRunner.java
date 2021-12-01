package by.jonline.module4.simplest_classes_and_objects.task8;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, 
set - и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer,
с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные 
на консоль.

    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    Найти и вывести:
    
    а) список покупателей в алфавитном порядке;
    b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class CustomerRunner {

	public static void main(String[] args) {

		UserActionController action = new UserActionController();

		action.uploadCustomersToCRM();
		action.getCustomers();
		action.getInfoAlphabetically();
		action.getInfoByCreditCardRange(52000000, 53600000);

	}

}
