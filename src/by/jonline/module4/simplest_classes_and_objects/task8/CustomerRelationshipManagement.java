package by.jonline.module4.simplest_classes_and_objects.task8;

public class CustomerRelationshipManagement {

	private Customer[] customers;
	private int capacity;
	private int size;
	
	CustomerRelationshipManagement() {
		
	}

	CustomerRelationshipManagement(int capacity) {
		customers = new Customer[capacity];
		this.capacity = capacity;
		size = 0;
	}

	public void addCustomerToCRM(Customer customer) {
		if (size < capacity) {
			customers[size++] = customer;

		} else {
			Customer[] newCustomers = new Customer[++capacity];

			for (int i = 0; i < size; i++) {
				newCustomers[i] = customers[i];
			}
			newCustomers[size] = customer;
			size = capacity;
			customers = newCustomers;
		}

	}

	public void addCustomersToCRM(Customer[] inputCustomers) {
		int newSize = size + inputCustomers.length;

		if (newSize < capacity) {
			for (int i = 0; i < inputCustomers.length; i++) {
				this.customers[size++] = inputCustomers[i];
			}

		} else {
			capacity = size + inputCustomers.length;
			Customer[] newCustomers = new Customer[capacity];

			for (int i = 0; i < size; i++) {
				newCustomers[i] = customers[i];
			}

			for (int i = 0; i < inputCustomers.length; i++) {
				newCustomers[size++] = inputCustomers[i];
			}

			customers = newCustomers;

		}

	}

	public Customer[] getCustomersFromCRM() {
		Customer[] outputCustomers = new Customer[size];

		for (int i = 0; i < size; i++) {
			outputCustomers[i] = customers[i];
		}
		return outputCustomers;

	}

}
