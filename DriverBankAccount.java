public class DriverBankAccount{
  public static void main(String[]args){
    BankAccount b1 = new BankAccount(1000.0, 1000001, "abc123");
    BankAccount b2 = new BankAccount(1234.0, 1000231, "abcasdg23");

    System.out.println("Account b1:");
    System.out.println(b1);
    System.out.println("Account b2:");
    System.out.println(b2);
    System.out.println();


    double cashAmount = 300.0;
    while(cashAmount < 3000){
      if (b1.transferTo(b2, cashAmount, "abc123")) {
        System.out.println("Money transfer successful");
        System.out.println("Account b1:");
        System.out.println(b1);
        System.out.println("Account b2:");
        System.out.println(b2);
      } else {
        System.out.println("Failed to withdraw "+cashAmount+" from "+b1);
      }
      cashAmount *= 2;
    }
  }
}
