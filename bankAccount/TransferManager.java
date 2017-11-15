package bankAccount;

public class TransferManager {

	public void transfer(BankAccount srcAccount, BankAccount targetAccount, long cent) {
	    assert srcAccount != null && targetAccount != null : "Accounts should exist!";
		srcAccount.withdraw(cent);
		targetAccount.deposit(cent);		    
	}
}
