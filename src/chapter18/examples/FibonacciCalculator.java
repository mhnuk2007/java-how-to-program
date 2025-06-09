package chapter18.examples;
// Fig. 18.5: FibonacciCalculator.java
// Recursive fibonacci method.

import java.math.BigInteger;

public class FibonacciCalculator {
    private static BigInteger Two = BigInteger.valueOf(2);

    // recursive declaration of method fibonacci
    public static BigInteger fibonacci(BigInteger number) {
        if (number.equals(BigInteger.ZERO) ||
                number.equals(BigInteger.ONE)) {
            return number;
        } else {
            return fibonacci(number.subtract(BigInteger.ONE)).add(
                    fibonacci(number.subtract(Two)));
        }
    }

    // displays the fibonacci values from 0-40
    public static void main(String[] args) {
        for (int counter = 0; counter <= 40; counter++) {
            System.out.printf("Fibonacci of %d is: %d%n", counter, fibonacci(BigInteger.valueOf(counter)));
        }
    }
}// end class FibonacciCalculator
