package chapter4.Exercises;
/*
    4.18 (Credit Limit Calculator) Develop a Java application that determines whether any
    of several department-store customers has exceeded the credit limit on a charge account.
     For each customer, the following facts are available:
        a) account number
        b) balance at the beginning of the month
        c) total of all items charged by the customer this month
        d) total of all credits applied to the customer’s account this month
        e) allowed credit limit.
    The program should input all these facts as integers, calculate the
    new balance  = (beginning balance + charges – credits), display the new balance and
    determine whether the new balance exceeds the customer’s credit limit. For those
    customers whose credit limit is exceeded, the program should display the message
    "Credit limit exceeded".
 */

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNo = input.nextInt();

        System.out.print("Enter Beginning Balance: ");
        int beginningBalance = input.nextInt();

        System.out.print("Enter total of items charged this month: ");
        int charges = input.nextInt();

        System.out.print("Enter total of all credits applied this month: ");
        int credits = input.nextInt();

        System.out.print("Enter limit of credits: ");
        int creditLimit = input.nextInt();

        int newBalance = beginningBalance + charges - credits;

        System.out.println("New Balance: " + newBalance);

        if (newBalance>creditLimit){
            System.out.println("Credit limit exceeded");
        }
    }
}
