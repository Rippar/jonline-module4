package by.jonline.module4.aggregation_and_composition.task4;

public class UserActionController {

	private AccountLogic logic = new AccountLogic();
	private AccountView view = new AccountView();

	public void getAccountByBalance(double balance) {
		Client client = logic.getClientFromSource();
		Account[] selection = logic.findAccountByBalance(balance, client.getAccounts());
		view.printNotification("Информация по счету с балансом = " + balance);
		view.printAccounts(selection);

	}

	public void getAccountByNumber(int number) {
		Client client = logic.getClientFromSource();

		Account[] selection = logic.findAccountByNumber(number, client.getAccounts());
		view.printNotification("Информация по счету с номером: " + number);
		view.printAccounts(selection);

	}

	public void getSortedAccountsByBalance() {
		Client client = logic.getClientFromSource();
		Account[] accounts = client.getAccounts();

		logic.sortByBalance(accounts);
		view.printNotification("Сортировка по балансу счета: ");
		view.printAccounts(accounts);
	}

	public void getSortedAccountsByNumber() {
		Client client = logic.getClientFromSource();
		Account[] accounts = client.getAccounts();

		logic.sortByNumber(accounts);
		view.printNotification("Сортировка по номеру счета: ");
		view.printAccounts(accounts);
	}

	public void getTotalBalance() {
		Client client = logic.getClientFromSource();
		Account[] accounts = client.getAccounts();

		double sum = logic.calculateTotalBalance(accounts);
		view.printNotification("Итоговый баланс по счетам:  " + sum);
	}

	public void getTotalPositiveBalance() {
		Client client = logic.getClientFromSource();
		Account[] accounts = client.getAccounts();

		double sum = logic.calculateTotalPositiveBalance(accounts);
		view.printNotification("Итоговый баланс по положительным счетам: " + sum);
	}

	public void getTotalNegativeBalance() {
		Client client = logic.getClientFromSource();
		Account[] accounts = client.getAccounts();

		double sum = logic.calculateTotalNegativeBalance(accounts);
		view.printNotification("Итоговый баланс по отрицательным счетам: " + sum);
	}

}
