package by.jonline.module4.aggregation_and_composition.task4;

public class Account {

	private static int counter;

	private final int accountNumber;
	private double balance;
	private boolean isBlocked;

	public Account() {
		accountNumber = counter++;

	}

	public Account(double balance) {
		accountNumber = counter++;
		this.balance = balance;
	}

	public Account(double balance, boolean isBlocked) {
		accountNumber = counter++;
		this.balance = balance;
		this.isBlocked = isBlocked;

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isBlocked ? 1231 : 1237);
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
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (isBlocked != other.isBlocked)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " accountNumber=" + accountNumber + ", balance=" + balance + ", isBlocked="
				+ isBlocked;
	}

}
