package bankAccount;

/**
 * A bank account class to create objects of the type BankAccount.
 * 
 * @author Philipp Schwarz
 *
 */
public class BankAccount {
  private String id;
  private long balance;

  /**
   * A constructor of a bank account.
   * 
   * @param id The id of the bank account.
   * @param startBalance The start balance of the bank account.
   */
  public BankAccount(String id, long startBalance) {
    this.id = id;
    // to ensure that the balance is never below 0
    if (startBalance >= 0) {
      this.balance = startBalance;
    } else {
      this.balance = 0;
    }
  }

  /**
   * A constructor of a bank account.
   * 
   * @param id The id of the bank account.
   */
  public BankAccount(String id) {
    this.id = id;
    this.balance = 0;
  }

  /**
   * @return Account Balance of the object.
   */
  public long getAccountBalance() {
    return this.balance;
  }

  /**
   * To withdraw money from the bank account.
   * 
   * @param amount The amount of money in cents to be withdrawn.
   */
  public void withdraw(long amount) {
    // check if the amount can be withdrawn without the balance going below 0
    if (this.balance - amount >= 0) {
      this.balance = this.balance - amount;
    } else {
      System.out.println("The account balance is not allowed to go below 0!\n");
    }
  }

  /**
   * To deposit money to the bank account.
   * 
   * @param amount The amount of money in cents to be deposited.
   */
  public void deposit(long amount) {
    this.balance = this.balance + amount;
  }

  @Override
  public String toString() {
    return String.format("[<%s>: ID=%s, Balance=%d, ", getClass().getSimpleName(), id, balance);
  }
}
