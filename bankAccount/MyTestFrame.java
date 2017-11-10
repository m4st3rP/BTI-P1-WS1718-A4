package bankAccount;

public class MyTestFrame {

  public static void main(String[] args) {
    BankAccount currentAccount = new CurrentAccount("CA", 123456, 78);
    BankAccount savingsAccount = new SavingsAccount("SA", 12345, 67);

    System.out.println(currentAccount);
    System.out.println(savingsAccount);
  }

}
