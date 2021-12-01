package by.jonline.module4.simplest_classes_and_objects.task9;

public class Library {

	private Book[] books;
	private int capacity;
	private int size;
	
	Library() {
		
	}

	Library(int capacity) {
		books = new Book[capacity];
		this.capacity = capacity;
		size = 0;
	}


	public void addBookToLibrary(Book book) {
		if (size < capacity) {
			books[size++] = book;

		} else {
			Book[] newBooks = new Book[++capacity];

			for (int i = 0; i < size; i++) {
				newBooks[i] = books[i];
			}
			newBooks[size] = book;
			size = capacity;
			books = newBooks;
		}

	}

	public void addBooksToLibrary(Book[] inputBooks) {
		int newSize = size + inputBooks.length;

		if (newSize < capacity) {
			for (int i = 0; i < inputBooks.length; i++) {
				books[size++] = inputBooks[i];
			}

		} else {
			capacity = size + inputBooks.length;
			Book[] newBooks = new Book[capacity];

			for (int i = 0; i < size; i++) {
				newBooks[i] = books[i];
			}

			for (int i = 0; i < inputBooks.length; i++) {
				newBooks[size++] = inputBooks[i];
			}

			books = newBooks;

		}

	}

	public Book[] getBooksFromLibrary() {
		Book[] outputBooks = new Book[size];

		for (int i = 0; i < size; i++) {
			outputBooks[i] = books[i];
		}
		return outputBooks;

	}

}
