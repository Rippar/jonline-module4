package by.jonline.module4.simplest_classes_and_objects.task8;

public class CustomerView {

	public void printCustomer(Customer customer) {
		System.out.println("id: " + customer.getId() + "\nФамилия: " + customer.getSurname() + "\nИмя: "
				+ customer.getName() + " " + "\nОтчество: " + customer.getMiddleName() + "\nАдрес: "
				+ customer.getAddress() + "\nНомер кредитной карты: " + customer.getCreditCardNumber()
				+ "\nНомер банковского счета: " + customer.getBankAccountNumber() + "\n");
	}

	public void printCustomers(Customer[] customers) {
		for (int i = 0; i < customers.length; i++) {
			printCustomer(customers[i]);
		}
	}

	public void printNotification(String notification) {
		System.out.println(notification + "\n");
	}

}
