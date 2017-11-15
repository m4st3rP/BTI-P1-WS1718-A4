package bankAccount;

/**
 * A class to create an object that makes it possible to transfer money from one account to the other.
 * 
 * @author Philipp Schwarz
 *
 */
public class TransferManager {

  /**
   * The method of a transfer manager object that transfers money from one bank account to another.
   * 
   * @param sourceAccount The source bank account of the transaction.
   * @param targetAccount The target bank account of the transaction.
   * @param amount The amount getting transfered.
   */
  public void transfer(CurrentAccount sourceAccount, CurrentAccount targetAccount, long amount) {
    long oldAmount = sourceAccount.getAccountBalance();
    sourceAccount.withdraw(amount);
    long newAmount = sourceAccount.getAccountBalance();
    // to check if the withdrawal suceeded
    if (newAmount != oldAmount) {
      targetAccount.deposit(amount);
    } else {
      System.out.println("Withdrawal failed!\n");
    }
  }
}
