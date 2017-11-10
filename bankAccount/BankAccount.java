package bankAccount;

// TODO Es wird mit Cent-Beträgen und auf den Cent genau gerechnet.
// TODO Die Bank rundet immer zu ihrem Vorteil.
// TODO Konten dürfen zu keinem Zeitpunkt negative Kontostände annehmen.
public class BankAccount {
  String id;
  long balance;

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

  public void withdraw(long amount) {
    if (this.balance - amount >= 0) {
      this.balance = this.balance - amount;
    }
  }

  public void deposit(long amount) {
    this.balance = this.balance + amount;
  }
}
