public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(double bal, int acc, String pass) {
    balance = bal;
    accountID = acc;
    password = pass;
  }
  public double getBalance() {
    return balance;
  }
  public int getaccountID() {
    return accountID;
  }
  public void setPassword(String newPass) {
    password = newPass;
  }
  public String toString() {
    return accountID + "\t" + balance;
  }
  public boolean deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      return true;
    }
    return false;
  }
  public boolean withdraw(double amount) {
    if (amount < balance) {
      balance -= amount;
      return true;
    }
    return false;
  }
  private boolean authenticate(String password){
    return this.password == password;
  }
  public boolean transferTo(BankAccount other, double amount, String password) {
    if (this.authenticate(password) && amount > 0 && amount < this.getBalance()) {
      this.withdraw(amount);
      other.deposit(amount);
      return true;
    } else {
      return false;
    }
  }
}
