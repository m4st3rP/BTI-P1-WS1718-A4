package bankAccount;

public class MyTestFrame {

  public static void main(String[] args) {
    testIntrest();
    testDeposit();
    testWithdrawGood();
    testWithdrawBad();
    testTransferGood();
    testTransferBad1();
    testTransferBad2();
  }
  
  public static void testIntrest() {
    System.out.println("testIntrest()");
    SavingsAccount savingsAccount1 = new SavingsAccount("SA1", 100000, 37);
    System.out.println(savingsAccount1);
    savingsAccount1.giveInterest();
    System.out.println(savingsAccount1);
    System.out.println("New Balance should be 103700.");
    System.out.println("----------------------------------");
  }

  public static void testDeposit() {
    System.out.println("testDeposit()");
    CurrentAccount currentAccount1 = new CurrentAccount("CA1", 100000, 50);
    System.out.println(currentAccount1);
    currentAccount1.deposit(123);
    System.out.println(currentAccount1);
    System.out.println("New Balance should be 100123.");
    System.out.println("----------------------------------");
  }
  
  public static void testWithdrawGood() {
    System.out.println("testWithdrawGood()");
    CurrentAccount currentAccount2 = new CurrentAccount("CA2", 100000, 50);
    System.out.println(currentAccount2);
    currentAccount2.withdraw(500);
    System.out.println(currentAccount2);
    System.out.println("New Balance should be 99450");
    System.out.println("----------------------------------");
  }
  
  public static void testWithdrawBad() {
    System.out.println("testWithdrawBad()");
    CurrentAccount currentAccount3 = new CurrentAccount("CA3", 100000, 50);
    System.out.println(currentAccount3);
    currentAccount3.withdraw(100001);
    System.out.println(currentAccount3);
    System.out.println("There should be an error message and the balance should stay the same.");
    System.out.println("----------------------------------");
  }
  
  public static void testTransferGood() {
    System.out.println("testTransferGood()");
    CurrentAccount currentAccount4 = new CurrentAccount("CA4", 100000, 50);
    CurrentAccount currentAccount5 = new CurrentAccount("CA5", 100000, 50);
    TransferManager transferManger1 = new TransferManager();
    System.out.println(currentAccount4);
    System.out.println(currentAccount5);
    transferManger1.transfer(currentAccount4, currentAccount5, 500);
    System.out.println(currentAccount4);
    System.out.println(currentAccount5);
    System.out.println("CA4 Balance should be 99450");
    System.out.println("CA5 Balance should be 100500");
    System.out.println("----------------------------------");
  }
  
  public static void testTransferBad1() {
    System.out.println("testTransferBad1()");
    CurrentAccount currentAccount6 = new CurrentAccount("CA6", 100000, 50);
    CurrentAccount currentAccount7 = new CurrentAccount("CA7", 100000, 50);
    TransferManager transferManger2 = new TransferManager();
    System.out.println(currentAccount6);
    System.out.println(currentAccount7);
    transferManger2.transfer(currentAccount6, currentAccount7, 5000000);
    System.out.println(currentAccount6);
    System.out.println(currentAccount7);
    System.out.println("There should be an error message and the balances should stay the same.");
    System.out.println("----------------------------------");
  }
  
  public static void testTransferBad2() {
    System.out.println("testTransferBad2()");
    CurrentAccount currentAccount8 = new CurrentAccount("CA6", 100000, 50);
    CurrentAccount currentAccount9 = new CurrentAccount("CA9", 100000, 50);
    TransferManager transferManger3 = new TransferManager();
    System.out.println(currentAccount8);
    System.out.println(currentAccount9);
    transferManger3.transfer(currentAccount8, currentAccount9, 99999);
    System.out.println(currentAccount8);
    System.out.println(currentAccount9);
    System.out.println("There should be an error message and the balances should stay the same.");
    System.out.println("----------------------------------");
  }
}
