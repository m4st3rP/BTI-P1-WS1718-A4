package bankAccount;

public class CurrentAccount extends BankAccount {

    private int fee;

    
    public CurrentAccount(String id, long cent, int fee) {
        super(id, cent);
        this.fee = fee;
    }

    
    @Override
    public void withdraw(long amount) {
        super.withdraw(amount + fee);
    }

    @Override
    public String toString() {
        return String.format(
            "[<%s>: Fee=%d %s]",
            CurrentAccount.class.getSimpleName(),
            fee,
            super.toString()
        );
    }
}
