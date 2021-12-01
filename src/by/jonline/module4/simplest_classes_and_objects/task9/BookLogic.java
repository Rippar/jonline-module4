package by.jonline.module4.simplest_classes_and_objects.task9;

public class BookLogic {

	public Book[] getBooksFromDatabase() {
		LibraryDatabase database = new LibraryDatabase();
		return database.getBooks();
	}

	public Book[] findByAuthor(String author, Book[] books) {

		int size = 0;
		int[] positions = new int[books.length];

		for (int i = 0; i < books.length; i++) {
			if (books[i].getAuthor().contains(author)) {
				size++;
				positions[i]++;
			}
		}

		Book[] selection = getSelectionArray(books, positions, size);

		return selection;
	}

	public Book[] findByPublishingHouse(String publishingHouse, Book[] books) {

		int size = 0;
		int[] positions = new int[books.length];

		for (int i = 0; i < books.length; i++) {
			if (books[i].getPublishingHouse().contains(publishingHouse)) {
				size++;
				positions[i]++;
			}
		}

		Book[] selection = getSelectionArray(books, positions, size);

		return selection;
	}

	public Book[] findByYear(int year, Book[] books) {

		int size = 0;
		int[] positions = new int[books.length];

		for (int i = 0; i < books.length; i++) {
			if (books[i].getYearOfPublishing() > year) {
				size++;
				positions[i]++;
			}
		}

		Book[] selection = getSelectionArray(books, positions, size);

		return selection;
	}

	private Book[] getSelectionArray(Book[] books, int[] positions, int size) {

		int k = 0;
		Book[] selection = new Book[size];

		for (int i = 0; i < positions.length; i++) {
			if (positions[i] == 1) {
				selection[k++] = books[i];
			}
		}

		return selection;
	}

}
