package bankAccount;

public class SavingsAccount extends BankAccount
{
	private int interestRate;
	
	public SavingsAccount(String id, long cent, int interestRate) {
		super(id, cent);
		assert interestRate >= 0 : "Interest Rate cannot be negative!";
		this.interestRate = interestRate;
	}
	
	public void giveInterest() {
		deposit(getAccountBalance() * interestRate / 1000);
	}
	
	 @Override
	 public String toString() {
	   return String.format(
	            "[<%s>: Interest Rate=%d %s]",
	             SavingsAccount.class.getSimpleName(),
	             interestRate,
	             super.toString()
	            );
	  }
}
