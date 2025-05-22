package chapter11.examples;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance = 1000.0;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal of " + amount);
        }
        balance -= amount;
    }
}
class TestBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.err.println("Withdrawal failed: " + e.getMessage());
        }
    }
}
