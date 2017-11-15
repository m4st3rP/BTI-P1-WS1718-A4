package bankAccount;

/**
 * A subclass of bankAccount to creates objects of the type CurrentAccount.
 * 
 * @author Philipp Schwarz
 *
 */
public class CurrentAccount extends BankAccount {
  private int fee;

  /**
   * The constructor of a current account.
   * 
   * @param id The ID of the Current Account.
   * @param startBalance The start balance of the Current Account.
   * @param fee The withdrawal fees of the Current Account.
   */
  public CurrentAccount(String id, long startBalance, int fee) {
    super(id, startBalance);
    this.fee = fee;
  }

  // override so that fee gets deducted too
  @Override
  public void withdraw(long amount) {
    super.withdraw(amount + this.fee);
  }

  @Override
  public String toString() {
    return super.toString() + String.format("Fee=%d]", fee);
  }
}
