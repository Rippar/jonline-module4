package by.jonline.module4.aggregation_and_composition.task4;

public class ClientSource {

	private Account acc0 = new Account(1000);
	private Account acc1 = new Account(570.5);
	private Account acc2 = new Account(6500);
	private Account acc3 = new Account(-210, true);

	public Client getClient() {
		return new Client("Dmitry", "Murzo", new Account[] { acc0, acc1, acc2, acc3 });
	}
}
