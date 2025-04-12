package chapter4.Exercises;
/*
    4.30 (Palindromes) A palindrome is a sequence of characters that reads the same
    backward as forward. For example, each of the following five-digit integers is a
    palindrome: 12321, 55555, 45554 and 11611. Write an application that reads in a
    five-digit integer and determines whether it’s a palindrome. If the number is not
    five digits long, display an error message and allow the user to enter a new value.
 */


import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a five-digit integer: ");
            number = input.nextInt();
            if (number >= 10000 && number <= 99999) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a five-digit integer: ");
            }
        }

        int digit1 = number/10000;
        int digit2 = (number/1000)%10;
        int digit4 = (number/10)%10;
        int digit5= number%10;

        if (digit1==digit5 && digit2==digit4){
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
