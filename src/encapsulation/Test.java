package encapsulation;




//Bankaccount example
class bankaccount2 {
    private long accountNumber;
    private double balance; 

    // Deposit: amount must be > 0
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw: amount must be > 0 and <= current balance
    public void setwithdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
        } else {
            System.out.println("Invalid amount or Insufficient balance");
        }
    }

    // Getters/setters as needed (no setBalance!)
    public double getBalance() { return balance; }

    public long getAccountNumber() { return accountNumber; }
    public void setAccountNumber(long accountNumber) { this.accountNumber = accountNumber; }
}


public class Test {
    public static void main(String[] args) {
        bankaccount2 ba = new bankaccount2();

        ba.deposit(-10);   // prints: Invalid deposit amount
        ba.setwithdraw(10);   // prints: Invalid amount or Insufficient balance
        ba.deposit(100);   // prints: Deposited amount
        ba.setwithdraw(10);   // prints: Withdrawn amount: 10

        System.out.println(ba.getBalance()); // 90
    }
}
