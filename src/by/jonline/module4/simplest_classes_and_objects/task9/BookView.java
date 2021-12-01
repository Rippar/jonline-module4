package by.jonline.module4.simplest_classes_and_objects.task9;

public class BookView {

	public void printBook(Book book) {
		System.out.println("id: " + book.getId() + "\nНазвание: " + book.getTitle() + "\nАвтор: " + book.getAuthor()
				+ "\nИздательство: " + book.getPublishingHouse() + "\nГод издания: " + book.getYearOfPublishing()
				+ "\nКоличество страниц: " + book.getPages() + "\nЦена: " + book.getPrice() + "\nТип переплета: "
				+ book.getBindingType() + "\n");
	}

	public void printBooks(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			printBook(books[i]);
		}
	}

	public void printNotification(String notification) {
		System.out.println(notification + "\n");
	}

}
