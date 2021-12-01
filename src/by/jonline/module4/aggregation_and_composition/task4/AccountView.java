package by.jonline.module4.aggregation_and_composition.task4;

public class AccountView {

	public void printNotification(String message) {
		System.out.println(message + "\n");
	}

	public void printAccount(Account account) {
		String status = account.isBlocked() ? "заблокирован" : "разблокирован";
		System.out.printf("Номер аккаунта: %d\nБаланс: %.3f\nСтатус аккаунта: %s\n\n", account.getAccountNumber(),
				account.getBalance(), status);
	}

	public void printAccounts(Account[] accounts) {
		for (Account account : accounts) {
			printAccount(account);
		}
	}

}
