package chapter8.exercises;
// AccountTest.java
/*
Exercise: 8.18 (Account Class with BigDecimal balance) Rewrite the Account class of Section 3.5 to store
the balance as a BigDecimal object and to perform all calculations using BigDecimals.
 */
import java.math.BigDecimal;

class Account {
    private String name;               // account holder's name
    private BigDecimal balance;        // account balance using BigDecimal

    // Constructor: initializes name and balance
    public Account(String name, BigDecimal initialBalance) {
        this.name = name;
        // Prevent negative balance
        if (initialBalance.compareTo(BigDecimal.ZERO) >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = BigDecimal.ZERO;
            System.out.println("Initial balance was invalid. Set to 0.00");
        }
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Deposit method
    public void credit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void debit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount.compareTo(balance) <= 0) {
            balance = balance.subtract(amount);
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
    }

    // Getter for balance
    public BigDecimal getBalance() {
        return balance;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Mohan Lal", new BigDecimal("100.00"));

        System.out.printf("Account holder: %s%n", account.getName());
        System.out.printf("Initial balance: $%.2f%n", account.getBalance());

        account.credit(new BigDecimal("50.25"));
        System.out.printf("After deposit: $%.2f%n", account.getBalance());

        account.debit(new BigDecimal("30.10"));
        System.out.printf("After withdrawal: $%.2f%n", account.getBalance());

        account.debit(new BigDecimal("150.00")); // exceeds balance
    }
}
