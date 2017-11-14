package bankAccount;

public class CurrentAccount extends BankAccount {
  private int fee;

  public CurrentAccount(String id, long startBalance, int fee) {
    super(id, startBalance);
    this.fee = fee;
  }
  
  @Override
  public void withdraw(long amount) {
      super.withdraw(amount + this.fee);
  }

  @Override
  public String toString() {
    return super.toString() + " Withdrawal Fee: " + this.fee;
  }
}
