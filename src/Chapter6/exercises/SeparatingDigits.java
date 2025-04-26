package Chapter6.exercises;
/*
    6.21 (Separating Digits) Write methods that accomplish each of the following tasks:
    a) Calculate the integer part of the quotient when integer a is divided by integer b.
    b) Calculate the integer remainder when integer a is divided by integer b.
    c) Use the methods developed in parts (a) and (b) to write a method displayDigits
    that receives an integer between 1 and 99999 and displays it as a sequence of digits,
    separating each pair of digits by two spaces. For example, the integer 4562 should
    appear as
    4 5 6 2
    Incorporate the methods into an application that inputs an integer and calls displayDigits
    by passing the method the integer entered. Display the results
 */

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();
        displayDigits(number);
        input.close();

    }
    // a) Calculate the integer part of the quotient when integer a is divided by integer b.
    public static int quotient(int a, int b) {
        return a / b;
    }

    // b) Calculate the integer remainder when integer a is divided by integer b.
    public static int remainder(int a, int b) {
        return a % b;
    }
    // c) Use the methods developed in parts (a) and (b) to write a method displayDigits
    public static void displayDigits(int number) {
        int reversed = 0;
        int temp = number;
        while (temp > 0) {
            int digit = remainder(temp, 10);
            reversed = reversed * 10 + digit;
            temp = quotient(temp, 10);

        }

        while (reversed > 0) {
            int digit = remainder(reversed, 10);
            System.out.print(digit + "  ");
            reversed = quotient(reversed, 10);
        }
        System.out.println();
    }
}
