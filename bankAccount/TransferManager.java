package bankAccount;

public class TransferManager {

  public void transfer(CurrentAccount sourceAccount, CurrentAccount targetAccount, long amount) {
    long oldAmount = sourceAccount.getAccountBalance();
    sourceAccount.withdraw(amount + sourceAccount.fee);
    long newAmount = sourceAccount.getAccountBalance();
    // to check if the withdrawal suceeded
    if (newAmount != oldAmount) {
      targetAccount.deposit(amount);
    } else {
      System.out.println("The account balance is not allowed to go below 0!");
    }
  }
}
