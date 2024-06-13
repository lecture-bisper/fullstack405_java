public class AccountEx {
  public static void main(String[] args) {

    Account acc = new Account();

    acc.deposit(10000);
    System.out.println("예금액 : " + acc.getBalance());

    try {
      acc.withdraw(30000);
    }
    catch (BalanceException e) {
      String errMsg = e.getMessage();
      System.out.println(errMsg);
      System.out.println();
      e.printStackTrace();
    }
  }
}












