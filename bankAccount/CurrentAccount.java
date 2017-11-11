package bankAccount;

public class CurrentAccount extends BankAccount {
  int fee;

  public CurrentAccount(String id, long startBalance, int fee) {
    super(id, startBalance);
    this.fee = fee;
  }

  public long getAccountBalance() {
    return this.balance;
  }
  
  @Override
  public void withdraw(long amount) {
    if (this.balance - (amount + this.fee) >= 0) {
      this.balance = this.balance - (amount + this.fee);
    } else {
      System.out.println("The account balance is not allowed to go below 0!");
    }
  }

  // TODO mit String.format() überarbeiten?
  @Override
  public String toString() {
    return "Account Type: "     + this.getClass().getSimpleName() +
           "\nID: "             + this.id +
           "\nBalance: "        + this.balance +
           "\nWithdrawal Fee: " + this.fee +
           "\n";
  }
}
