package bankAccount;

/**
 * A subclass of bankAccount to creates objects of the type SavingsAccount.
 * 
 * @author Philipp Schwarz
 *
 */
public class SavingsAccount extends BankAccount {
  private int interestRate;

  /**
   * The constructor of a savings account.
   * 
   * @param id The ID of the savings account.
   * @param startBalance The start balance of the savings account.
   * @param interestRate The interest rate the account receives for each Interest rate it gets.
   */
  public SavingsAccount(String id, long startBalance, int interestRate) {
    super(id, startBalance);
    this.interestRate = interestRate;
  }

  /**
   * To distribute the interest rate.
   */
  public void giveInterest() {
    // Since long always round down this operation is always in benefit of the bank
    deposit(getAccountBalance() * this.interestRate / 1000);
  }

  @Override
  public String toString() {
    return super.toString() + String.format("Interest Rate=%d]", interestRate);
  }
}
