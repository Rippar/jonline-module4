package by.jonline.module4.simplest_classes_and_objects.task8;

public class CustomerLogic {

	public Customer[] getCustomersFromDatabase() {
		CustomersDatabase database = new CustomersDatabase();
		return database.getCustomers();
	}

	public void sortAlphabetically(Customer[] customers) {

		for (int i = customers.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				// осуществляем алфавитную сортировку по сцепке "фамилия + имя"

				String surnamePlusName0 = customers[i].getSurname() + customers[i].getName();
				String surnamePlusName1 = customers[j].getSurname() + customers[j].getName();

				int result = surnamePlusName0.compareTo(surnamePlusName1);

				if (result < 0) {

					Customer tmp = customers[i];
					customers[i] = customers[j];
					customers[j] = tmp;

				// если у двух клиентов совпадают имя и фамилия, сортируем по полю id
					
				} else if (result == 0) {

					if (customers[i].getId() < customers[j].getId()) {

						Customer tmp = customers[i];
						customers[i] = customers[j];
						customers[j] = tmp;

					}

				}
			}
		}

	}

	public Customer[] findByCreditCardNumRange(int min, int max, Customer[] customers) {

		if (min > max) {

			int tmp = min;
			min = max;
			max = tmp;
		}

		int size = 0;
		int[] positions = new int[customers.length];

		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getCreditCardNumber() >= min && customers[i].getCreditCardNumber() <= max) {
				size++;
				positions[i]++;
			}
		}

		Customer[] selection = getSelectionArray(customers, positions, size);

		return selection;
	}

	private Customer[] getSelectionArray(Customer[] customers, int[] positions, int size) {

		int k = 0;
		Customer[] selection = new Customer[size];

		for (int i = 0; i < positions.length; i++) {
			if (positions[i] == 1) {
				selection[k++] = customers[i];
			}
		}

		return selection;
	}

}
