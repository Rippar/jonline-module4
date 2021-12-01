package by.jonline.module4.simplest_classes_and_objects.task8;

public class UserActionController {

	private CustomerRelationshipManagement crm = new CustomerRelationshipManagement();
	private CustomerLogic logic = new CustomerLogic();
	private CustomerView view = new CustomerView();

	public void uploadCustomersToCRM() {

		Customer[] customers = logic.getCustomersFromDatabase();
		crm.addCustomersToCRM(customers);
		view.printNotification("Список покупателей загружен в CRM-систему.");
	}

	public void getInfoAlphabetically() {

		Customer[] customers = crm.getCustomersFromCRM();
		logic.sortAlphabetically(customers);
		view.printNotification("Вывод списка покупателей в алфавитном порядке: ");
		view.printCustomers(customers);
	}

	public void getInfoByCreditCardRange(int min, int max) {

		Customer[] customers = crm.getCustomersFromCRM();

		Customer[] selection = logic.findByCreditCardNumRange(min, max, customers);

		if (selection.length != 0) {
			view.printNotification("Покупатели с номером кредитной карты в диапазоне от " + min + " до " + max + ":");
			view.printCustomers(selection);

		} else {
			view.printNotification(
					"Покупателей с номером кредитной карты в диапазоне от " + min + " до " + max + " не найдено!");
		}

	}

	public void getCustomers() {
		Customer[] customers = crm.getCustomersFromCRM();
		view.printCustomers(customers);
	}

}
