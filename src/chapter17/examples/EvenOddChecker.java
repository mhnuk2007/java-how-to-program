package chapter17.examples;
// Even/Odd Checker using Predicate

import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(number + " is " + (isEven.test(number) ? "Even" : "Odd"));

        scanner.close();
    }
}
