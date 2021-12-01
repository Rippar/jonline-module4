package by.jonline.module4.simplest_classes_and_objects.task9;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, 
set - и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Book,
с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные 
на консоль.

    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
    Найти и вывести:
    a) список книг заданного автора;
    b) список книг, выпущенных заданным издательством;
    c) список книг, выпущенных после заданного года.*/

public class BookRunner {

	public static void main(String[] args) {

		UserActionController action = new UserActionController();

		action.uploadInfoToLibrary();
		action.getBooks();
		
		action.getInfoByAuthor("Rowling");
		action.getInfoByPublishingHouse("Editions du Seuil");
		action.getInfoByPublishedSince(2000);
	}

}
