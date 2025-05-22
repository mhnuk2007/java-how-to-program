package chapter11.examples;

public class BankAccount1 {
    private double balance;

    public BankAccount1(double initialBalance) {
        // Precondition: initialBalance must be non-negative
        assert initialBalance >= 0 : "Initial balance cannot be negative";
        this.balance = initialBalance;
    }

    /**
     * Withdraws a specified amount from the account.
     *
     * Preconditions:
     * - amount must be greater than 0
     * - amount must not exceed the current balance
     *
     * Postconditions:
     * - balance is reduced by the amount
     */
    public void withdraw(double amount) {
        // Precondition checks
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }

        double oldBalance = balance;

        balance -= amount;

        // Postcondition check (optional, for development/debugging)
        assert balance == oldBalance - amount : "Postcondition failed: incorrect new balance.";
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount1 account = new BankAccount1(500.0);
        account.withdraw(150.0);
        System.out.println("Remaining balance: " + account.getBalance()); // Expected: 350.0
    }
}
