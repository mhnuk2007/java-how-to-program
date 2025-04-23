package chapter3.examples;

// Fig. 3.9: AccountTest.java
// Demonstrates input/output and interaction with Account objects.

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        // Create two Account objects with different initial balances
        Account account1 = new Account("Sunny Chauhan", 50.00);
        Account account2 = new Account("Honey Chauhan", -7.53); // balance will be 0.0 due to validation

        // Display initial balances
        System.out.printf("%s balance $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance $%.2f%n", account2.getName(), account2.getBalance());

        // Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Prompt user for deposit amount for account1
        System.out.print("Enter deposit amount for account1: $");
        double depositAmount = input.nextDouble(); // read deposit amount from user
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // add the deposit to account1

        // Display updated balances
        System.out.printf("%s balance $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance $%.2f%n", account2.getName(), account2.getBalance());

        // Prompt user for deposit amount for account2
        System.out.print("Enter deposit amount for account2: $");
        depositAmount = input.nextDouble(); // read deposit amount from user
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add the deposit to account2

        // Display final updated balances
        System.out.printf("%s balance $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance $%.2f%n", account2.getName(), account2.getBalance());
    }
}
