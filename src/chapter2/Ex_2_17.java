package chapter2;
/*
    2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three
    integers from the user and displays the sum, average, product, smallest and
    largest of the numbers. Use the techniques shown in Fig. 2.15.
    [Note: The calculation of the average in this exercise should result in an integer
    representation of the average. So, if the sum of the values is 7,
    the average should be 2, not 2.3333….]
 */

import java.util.Scanner;

public class Ex_2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, sum, average, product, smallest, largest;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        average = sum / 3;
        product = num1 * num2 * num3;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        input.close();
    }


}
