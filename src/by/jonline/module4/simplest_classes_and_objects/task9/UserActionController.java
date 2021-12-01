package by.jonline.module4.simplest_classes_and_objects.task9;

public class UserActionController {

	private Library library = new Library();
	private BookLogic logic = new BookLogic();
	private BookView view = new BookView();

	public void uploadInfoToLibrary() {
		Book[] books = logic.getBooksFromDatabase();
		library.addBooksToLibrary(books);
		view.printNotification("Список книг загружен в библиотеку.");
	}

	public void getInfoByAuthor(String author) {
		Book[] books = library.getBooksFromLibrary();
		Book[] selection = logic.findByAuthor(author, books);

		view.printNotification("Список книг, найденных по заданному автору: " + author);
		view.printBooks(selection);
	}

	public void getInfoByPublishingHouse(String publishingHouse) {
		Book[] books = library.getBooksFromLibrary();
		Book[] selection = logic.findByPublishingHouse(publishingHouse, books);

		view.printNotification("Список книг, найденных по заданному издательству: " + publishingHouse);
		view.printBooks(selection);
	}

	public void getInfoByPublishedSince(int year) {
		Book[] books = library.getBooksFromLibrary();
		Book[] selection = logic.findByYear(year, books);

		view.printNotification("Список книг, выпущенных после " + year + "-го года:");
		view.printBooks(selection);
	}

	public void getBooks() {
		Book[] books = library.getBooksFromLibrary();
		view.printBooks(books);
	}

}
