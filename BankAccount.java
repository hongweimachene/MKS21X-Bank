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
  public String getPassword() {
    return password;
  }
  public boolean setPassword(String newPass) {
    password = newPass;
    return true;
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
}
