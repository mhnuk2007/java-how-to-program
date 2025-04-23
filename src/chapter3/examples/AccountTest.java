package chapter3.examples;
// Fig. 3.6: AccountTest.java
// Using the Account constructor to initialize the name instance
// variable at the time each Account object is created.
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Sunny Chauhan");
        Account account2 = new Account("Honey Chauhan");

        System.out.printf("account1 name is: %s%n", account1.getName());

        System.out.printf("account2 name is: %s%n", account2.getName());



    }
}
