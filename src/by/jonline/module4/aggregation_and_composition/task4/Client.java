package by.jonline.module4.aggregation_and_composition.task4;

public class Client {

	private static int counter;

	private final int id;
	private String name;
	private String surname;
	private Account[] accounts;

	public Client() {
		id = counter++;
		name = "";
		surname = "";
		accounts = new Account[] { new Account() };
	}

	public Client(String name, String surname) {

		id = counter++;
		this.name = name;
		this.surname = surname;

		accounts = new Account[] { new Account() };

	}

	public Client(String name, String surname, Account[] accounts) {

		id = counter++;
		this.name = name;
		this.surname = surname;
		this.accounts = accounts;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());

		if (accounts != null) {
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null) {
					result = prime * result + (accounts[i] == null ? 0 : accounts[i].hashCode());
				}

			}
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;

		if (this.accounts != null && other.accounts != null) {

			if (this.accounts.length != other.accounts.length) {
				return false;
			}

			for (int i = 0; i < accounts.length; i++) {
				if (!this.accounts[i].equals(other.accounts[i])) {
					return false;
				}
			}
		}

		if (this.accounts == null) {
			if (other.accounts != null) {
				return false;
			}
		}

		if (other.accounts == null) {
			if (this.accounts != null) {
				return false;
			}
		}

		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {

		StringBuilder result = new StringBuilder(getClass().getSimpleName() + " id=" + id + ", name=" + name
				+ ", surname=" + surname + ", accounts= \n");

		for (int i = 0; i < accounts.length; i++) {
			result.append(accounts[i] + "\n");
		}

		return result.toString();
	}

}
