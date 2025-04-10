package chapter2;
/*
    2.25 (Odd or Even) Write an application that reads an integer and determines and
    prints whether it’s odd or even.
    [Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple
    of 2 leaves a remainder of 0 when divided by 2.]
 */

import java.util.Scanner;

public class Ex_2_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        if (num%2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        input.close();
    }
}
