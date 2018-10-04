public class Driver{
  public static void main(String[] args){
    BankAccount a = new BankAccount(1023.45, 100203, "thanoscar");
    System.out.println("Balance: " + a.getBalance());
    System.out.println("Account ID: " + a.getaccountID());
    System.out.println(a);
    if (a.deposit(5000)) {
      System.out.println("Deposit successful");
    } else {
      System.out.println("Deposit failed");
    }
    if (a.withdraw(2700.50)) {
      System.out.println("Withdrawal successful");
    } else {
      System.out.println("Withdrawal failed");
    }
    if (a.deposit(-5000)) {
      System.out.println("Deposit successful");
    } else {
      System.out.println("Deposit failed");
    }
    if (a.withdraw(27700.50)) {
      System.out.println("Withdrawal successful");
    } else {
      System.out.println("Withdrawal failed");
    }
  }
}
