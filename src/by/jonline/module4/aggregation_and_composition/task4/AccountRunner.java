package by.jonline.module4.aggregation_and_composition.task4;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

public class AccountRunner {

	public static void main(String[] args) {

		UserActionController action = new UserActionController();

		action.getSortedAccountsByNumber();
		action.getSortedAccountsByBalance();

		action.getAccountByNumber(3);
		action.getAccountByBalance(570.5);

		action.getTotalBalance();
		action.getTotalPositiveBalance();
		action.getTotalNegativeBalance();

	}

}
