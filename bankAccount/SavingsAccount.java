package bankAccount;

public class SavingsAccount extends BankAccount {
  private int interestRate;

  public SavingsAccount(String id, long startBalance, int interestRate) {
    super(id, startBalance);
    this.interestRate = interestRate;
  }

  public void giveInterest() {
    // Since long always round down this operation is always in benefit of the bank
    deposit(getAccountBalance()*this.interestRate / 1000);
  }

  @Override
  public String toString() {
    return super.toString() + " Interest Rate: " + this.interestRate;
  }
}
