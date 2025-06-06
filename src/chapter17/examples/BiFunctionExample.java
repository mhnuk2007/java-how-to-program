package chapter17.examples;

import java.util.Scanner;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Sum: " + add.apply(num1, num2));


    }
}
