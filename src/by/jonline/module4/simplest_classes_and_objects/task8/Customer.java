package by.jonline.module4.simplest_classes_and_objects.task8;

public class Customer {

	private static int count;

	private final int id;
	private String surname;
	private String name;
	private String middlename;
	private String address;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer() {
		id = count++;
		surname = "";
		name = "";
		middlename = "";
		address = "";
	}

	public Customer(String surname, String name, String middleName, String address, int creditCardNumber,
			int bankAccountNumber) {

		id = count++;

		this.surname = surname;
		this.name = name;
		this.middlename = middleName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;

	}

	public int getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middlename;
	}

	public void setMiddleName(String middleName) {
		this.middlename = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " id: " + id + "\nsurname: " + surname + "\nname: " + name + " "
				+ "\nmiddleName: " + middlename + "\naddress: " + address + "\nCredit card number: " + creditCardNumber
				+ "\nBank account number: " + bankAccountNumber + "\n";
	}

	@Override
	public int hashCode() {
		int hash0 = 0;
		int hash1 = 0;
		int hash2 = 0;
		int hash3 = 0;

		if (surname != null) {
			hash0 = surname.hashCode();
		}

		if (name != null) {
			hash1 = name.hashCode();
		}

		if (middlename != null) {
			hash2 = middlename.hashCode();
		}

		if (address != null) {
			hash3 = address.hashCode();
		}

		return 31 * id + bankAccountNumber + creditCardNumber + hash0 + hash1 + hash2 + hash3;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Customer other = (Customer) obj;

		if (this.id != other.id) {
			return false;
		}

		if (surname == null) {

			if (other.surname != null) {
				return false;
			}

		} else if (!surname.equals(other.surname)) {
			return false;
		}

		if (name == null) {

			if (other.name != null) {
				return false;

			}

		} else if (!name.equals(other.name)) {
			return false;
		}

		if (middlename == null) {

			if (other.middlename != null) {
				return false;

			}

		} else if (!middlename.equals(other.middlename)) {
			return false;
		}

		if (this.creditCardNumber != other.creditCardNumber) {
			return false;
		}

		if (this.bankAccountNumber != other.bankAccountNumber) {
			return false;
		}

		return true;

	}

}
