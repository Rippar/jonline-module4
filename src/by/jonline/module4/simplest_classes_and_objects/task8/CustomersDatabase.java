package by.jonline.module4.simplest_classes_and_objects.task8;

public class CustomersDatabase {

	private Customer c0 = new Customer("Korinchuk", "Alexander", "Ivanovich", "Novaya st, 6-49", 51603229, 543678);
	private Customer c1 = new Customer("Morozov", "Alexander", "Sergeevich", "Vaupshasova st, 23-32", 53517891, 765328);
	private Customer c2 = new Customer("Balabanov", "Andrei", "Andreevich", "Zaslauskaya st, 13-49", 52017091, 435323);
	private Customer c3 = new Customer("Kazachok", "Natalia", "Victorovna", "Moskovskays st, 2-31", 52515764, 365284);
	private Customer c4 = new Customer("Korinchuk", "Veronika", "Dmitrievna", "Novaya st, 6-49", 53615751, 865420);

	public Customer[] getCustomers() {
		return new Customer[] { c0, c1, c2, c3, c4 };
	}

}
