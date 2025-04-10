package chapter2;
/*
    2.24 (Largest and Smallest Integers) Write an application that reads five integers
    and determines and prints the largest and smallest integers in the group.
    Use only the programming techniques you learned in this chapter.
 */

import java.util.Scanner;

public class Ex_2_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5, smallest, largest;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter third number: ");
        num3 = input.nextInt();
        System.out.print("Enter fourth number: ");
        num4 = input.nextInt();
        System.out.print("Enter fifth number: ");
        num5 = input.nextInt();

        smallest = num1;
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;
        if (num4 < smallest) smallest = num4;
        if (num5 < smallest) smallest = num5;

        largest = num1;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;
        if (num4 > largest) largest = num4;
        if (num5 > largest) largest = num5;

        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);

        input.close();

    }
}
