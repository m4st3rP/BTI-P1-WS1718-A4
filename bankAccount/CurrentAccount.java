package bankAccount;

public class CurrentAccount extends BankAccount {
  String id;
  long balance;
  int fee;

  public CurrentAccount(String id, long startBalance, int fee) {
    super(id, startBalance);
    this.fee = fee;
  }

  public long getAccountBalance() {
    return this.balance;
  }

  // TODO mit String.format() überarbeiten?
  public String toString() {
    return "Class: " + this.getClass() + "\nID: " + this.id + "\nBalance: " + this.balance + "\nWithdrawal Fee: " + this.fee + "\n";
  }
}
