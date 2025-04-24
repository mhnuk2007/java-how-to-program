package chapter3.exercises;
// Fig. 3.9: AccountTest.java (Refactored)
// Inputting and outputting floating-point numbers with Account objects using displayAccount method.

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Sunny Chauhan", 50.00);
        Account account2 = new Account("Honey Chauhan", -7.53); // will be 0.0

        // display initial balances
        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        // Deposit for account1
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);

        // display balances
        displayAccount(account1);
        displayAccount(account2);

        // Deposit for account2
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);

        // display final balances
        displayAccount(account1);
        displayAccount(account2);
    }

    // ✅ Reusable static method to display any account's info
    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}

