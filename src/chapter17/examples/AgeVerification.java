package chapter17.examples;

import java.util.Scanner;
import java.util.function.Predicate;

public class AgeVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Predicate<Integer> isAdult = a -> a >= 18;

        if (isAdult.test(age)) {
            System.out.println("You're eligible to vote!");
        } else {
            System.out.println("Sorry, you must be 18+ to vote.");
        }

        scanner.close();
    }
}
