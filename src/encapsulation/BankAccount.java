package encapsulation;

public class BankAccount {
    // Private fields
    private String accountNumber;
    private double balance;

    // Public getter methods
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    // Public setter method only for balance, with validation
    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }

    // Constructor
    public BankAccount(String accNum, double initialBalance) {
        accountNumber = accNum;
        if (initialBalance >= 0) {
            balance = initialBalance;
        }
    }

    // Test in main
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 100.0);
        System.out.println("Current Balance: " + account.getBalance()); // 100.0

        account.setBalance(150.50);
        System.out.println("New Balance: " + account.getBalance()); // 150.5

        account.setBalance(-50); // Error message printed
        System.out.println("Balance after invalid update: " + account.getBalance()); // Still 150.5
    }
}
