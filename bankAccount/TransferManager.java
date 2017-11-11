package bankAccount;

public class TransferManager {

  public void transfer(CurrentAccount sourceAccount, CurrentAccount targetAccount, long amount) {
    long oldAmount = sourceAccount.getAccountBalance();
    sourceAccount.withdraw(amount);
    long newAmount = sourceAccount.getAccountBalance();
    // to check if the withdrawal suceeded
    if (newAmount != oldAmount) {
      targetAccount.deposit(amount);
    } else {
      System.out.println("Withdrawal failed!");
    }
  }
}
