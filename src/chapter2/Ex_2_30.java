package chapter2;
/*
    2.30 (Separating the Digits in an Integer) Write an application that inputs one number
    consisting of five digits from the user, separates the number into its individual digits
    and prints the digits separated from one another by three spaces each. For example,
    if the user types in the number 42339, the program should print
    4 2 3 3 9
    Assume that the user enters the correct number of digits. What happens when you enter
    a number with more than five digits? What happens when you enter a number with fewer
    than five digits? [Hint: It’s possible to do this exercise with the techniques you
    learned in this chapter. You’ll need to use both division and remainder operations to
    “pick off” each digit.]
 */

import java.util.Scanner;

public class Ex_2_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int num = input.nextInt();

        int digit5 = num % 10;
        num /= 10;
        int digit4 = num % 10;
        num /= 10;
        int digit3 = num % 10;
        num /= 10;
        int digit2 = num % 10;
        num /= 10;
        int digit1 = num % 10;

        System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);
        input.close();
    }
}