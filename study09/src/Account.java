public class Account {

  private long balance;

  public Account() {}

  public long getBalance() {
    return balance;
  }

  public void deposit(int money) {
    balance += money;
  }

  public void withdraw(int money) throws BalanceException {
    if (balance < money) {
      throw new BalanceException("잔고 부족 : " + (money - balance) + " 모자람");
    }

    balance -= money;
  }
}












