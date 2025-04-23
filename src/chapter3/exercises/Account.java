package chapter3.exercises;

// Fig. 3.8: Account.java (Modified)
// Account class with deposit and withdraw functionality.

public class Account {
    private String name;
    private double balance;

    // Constructor with name and initial balance
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    // Method to deposit money
    public void deposit(double depositAmount){
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    // ✅ New withdraw method
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("Withdrawal amount exceeded account balance.");
        } else {
            balance -= withdrawAmount;
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
