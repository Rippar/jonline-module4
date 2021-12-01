package by.jonline.module4.aggregation_and_composition.task4;

public class AccountLogic {

	public Client getClientFromSource() {
		ClientSource source = new ClientSource();
		return source.getClient();
	}

	public void block(Account account) {
		account.setBlocked(true);
	}

	public void unblock(Account account) {
		account.setBlocked(false);
	}

	public void sortByBalance(Account[] accounts) {
		for (int i = accounts.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (accounts[i].getBalance() < accounts[j].getBalance()) {

					Account tmp = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = tmp;
				}
			}

		}
	}

	public void sortByNumber(Account[] accounts) {
		for (int i = accounts.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (accounts[i].getAccountNumber() < accounts[j].getAccountNumber()) {

					Account tmp = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = tmp;
				}
			}

		}
	}

	public Account[] findAccountByBalance(double balance, Account[] accounts) {

		int[] positions = new int[accounts.length];
		int size = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() == balance) {
				positions[i]++;
				size++;
			}
		}

		Account[] selection = getSelectionArray(accounts, positions, size);

		return selection;
	}

	public Account[] findAccountByNumber(int number, Account[] accounts) {

		int[] positions = new int[accounts.length];
		int size = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNumber() == number) {
				positions[i]++;
				size++;
			}
		}

		Account[] selection = getSelectionArray(accounts, positions, size);

		return selection;
	}

	public double calculateTotalBalance(Account[] accounts) {
		double sum = 0.0;
		for (int i = 0; i < accounts.length; i++) {
			sum += accounts[i].getBalance();
		}

		return sum;

	}

	public double calculateTotalPositiveBalance(Account[] accounts) {

		double sum = 0.0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() > 0.0) {
				sum += accounts[i].getBalance();
			}
		}

		return sum;

	}

	public double calculateTotalNegativeBalance(Account[] accounts) {

		double sum = 0.0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() < 0.0) {
				sum += accounts[i].getBalance();
			}
		}

		return sum;

	}

	private Account[] getSelectionArray(Account[] accounts, int[] positions, int size) {

		int k = 0;
		Account[] selection = new Account[size];

		for (int i = 0; i < positions.length; i++) {
			if (positions[i] == 1) {
				selection[k++] = accounts[i];
			}
		}

		return selection;
	}

}
