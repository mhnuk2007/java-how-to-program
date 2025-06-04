package chapter16.exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
            Set<Integer> primeFactors = getPrimeFactors(number);
            System.out.println("Unique prime factors: " + primeFactors);
        }
    }

    // Check if number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Get unique prime factors
    public static Set<Integer> getPrimeFactors(int num) {
        Set<Integer> factors = new HashSet<>();
        int divisor = 2;

        while (num > 1) {
            if (num % divisor == 0) {
                factors.add(divisor);
                num /= divisor;
            } else {
                divisor++;
            }
        }

        return factors;
    }
}
