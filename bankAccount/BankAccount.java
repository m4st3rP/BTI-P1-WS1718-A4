package bankAccount;

// TODO Die Bank rundet immer zu ihrem Vorteil.
public class BankAccount {
  private String id;
  private long balance;

  public BankAccount(String id, long startBalance) {
    this.id = id;
    // to ensure that the balance is never below 0
    if (startBalance >= 0) {
      this.balance = startBalance;
    } else {
      this.balance = 0;
    }
  }

  public BankAccount(String id) {
    this.id = id;
    this.balance = 0;
  }

  public long getAccountBalance() {
    return this.balance;
  }

  public void withdraw(long amount) {
    if (this.balance - amount >= 0) {
      this.balance = this.balance - amount;
    } else {
      System.out.println("The account balance is not allowed to go below 0!\n");
    }
  }

  public void deposit(long amount) {
    this.balance = this.balance + amount;
  }

  @Override
  public String toString() {
    return String.format("Account Type: " + getClass().getSimpleName() + " ID: " + id + " Balance: " + balance);
  }
}
