package bankAccount;

public class BankAccount {

    private String id;
    private long balance;

    
    
    public BankAccount(String id, long balance) {
        this.id = id;
        assert balance >= 0 : "Balance cannot be negative!";
        this.balance = balance;
    }

    public BankAccount(String id) {
        this( id, 0 );
    }
    
    
    
    /**
     * 
     * @param amount the amount to withdraw
     * @return true if valid transaction happened, false if no transaction happened
     */
    public void withdraw(long amount) {
        assert amount >= 0 : "Cannot withdraw negative amount!";
        assert balance >= amount : "Cannot execute transaction, because of insufficient funds (balance < amount)";
        balance -= amount;
    }

    public void deposit(long amount) {
        assert amount >= 0 : "Cannot deposit negative amount!";
        balance += amount;
    }

    public long getAccountBalance() {
        return balance;
    }

    @Override
    public String toString() {
      return String.format(
          "[<%s>: ID=%s, Balance=%d]",
          BankAccount.class.getSimpleName(),
          id,
          balance
      );
    }
}
