package bankAccount;

public class SavingsAccount extends BankAccount {
  String id;
  long balance;
  int interestRate;

  public SavingsAccount(String id, long startBalance, int interestRate) {
    super(id, startBalance);
    this.interestRate = interestRate;
  }

  public void giveInterest() {
    // TODO die ganzen this notwendig?
    // Since long always round down this operation is always in benefit of the bank
    this.balance = this.balance * this.interestRate / 1000;
  }

  // TODO mit String.format() überarbeiten?
  public String toString() {
    return "Class: " + this.getClass() + "\nID: " + this.id + "\nBalance: " + this.balance + "\nInterest Rate: " + this.interestRate + "\n";
  }
}
