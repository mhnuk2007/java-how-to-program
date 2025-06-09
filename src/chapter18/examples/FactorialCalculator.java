package chapter18.examples;
// Fig. 18.9: FactorialCalculator.java
// Iterative factorial method.

import java.math.BigInteger;

public class FactorialCalculator {
    // recursive declaration of method factorial
    public static long factorial(long number) {
        long result = 1;
        // iterative declaration of method factorial
        for (long i = number; i >=1; i--) {
            result *= i;
        }
        return result;

    }

    // output factorials for values 0-10
    public static void main(String[] args) {
        for (int counter = 0; counter <= 10; counter++){
            System.out.printf("%d! = %d%n", counter, factorial(counter));
        }
    }
} // end class FactorialCalculator
