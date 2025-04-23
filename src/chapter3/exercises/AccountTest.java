package chapter3.exercises;

// Fig. 3.9: AccountTest.java (Modified)
// Demonstrates deposit and withdraw interaction with Account objects.

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Sunny Chauhan", 50.00);
        Account account2 = new Account("Honey Chauhan", -7.53); // will be 0.0

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        // Deposit to account1
        System.out.print("Enter deposit amount for account1: $");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);

        // Withdraw from account1
        System.out.print("Enter withdrawal amount for account1: $");
        double withdrawAmount = input.nextDouble();
        account1.withdraw(withdrawAmount);

        // Display updated balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

        // Deposit to account2
        System.out.print("Enter deposit amount for account2: $");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);

        // Withdraw from account2
        System.out.print("Enter withdrawal amount for account2: $");
        withdrawAmount = input.nextDouble();
        account2.withdraw(withdrawAmount);

        // Display final balances
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
    }
}
