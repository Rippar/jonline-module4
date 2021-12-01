package by.jonline.module4.simplest_classes_and_objects.task9;

public class LibraryDatabase {

	private Book b0 = new Book("1984", "George Orwell", "Secker & Warburg", 1949, 328, 5.99, "softback");

	private Book b1 = new Book("The Gulag Archipelago", "Aleksandr Solzhenitsyn", "Editions du Seuil", 1973, 2048,
			15.99, "hardback");

	private Book b2 = new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", "Editorial Sudamericana",
			1967, 544, 3.99, "softback");

	private Book b3 = new Book("Harry Potter and the Order of the Phoenix", "Joanne Rowling", "Raincoast", 2003, 766,
			11.59, "hardback");

	private Book b4 = new Book("Harry Potter and the Half-Blood Prince", "Joanne Rowling", "Raincoast", 2005, 607, 9.49,
			"hardback");

	public Book[] getBooks() {
		return new Book[] { b0, b1, b2, b3, b4 };
	}

}
