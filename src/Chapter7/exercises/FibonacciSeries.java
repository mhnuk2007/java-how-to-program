package Chapter7.exercises;
/*
Exercise: 7.29 (Fibonacci Series) The Fibonacci series
0, 1, 1, 2, 3, 5, 8, 13, 21, …
begins with the terms 0 and 1 and has the property that each succeeding term is the sum of the two
preceding terms.
a) Write a method fibonacci(n) that calculates the nth Fibonacci number. Incorporate
this method into an application that enables the user to enter the value of n.
b) Determine the largest Fibonacci number that can be displayed on your system.
c) Modify the application you wrote in part (a) to use double instead of int to calculate
and return Fibonacci numbers, and use this modified application to repeat part (b).
 */

import java.util.Scanner;

public class FibonacciSeries {
    // a) Fibonacci method using int
    public static int fibonacciInt(int n) {
        if (n <= 1)
            return n;
            
        int prev = 0, current = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

    // c) Fibonacci method using double
    public static double fibonacciDouble(int n) {
        if (n <= 1)
            return n;
            
        double prev = 0.0, current = 1.0;
        for (int i = 2; i <= n; i++) {
            double next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

    // b) Find the largest Fibonacci number that fits in int
    public static int maxFibonacciInt() {
        int prev = 0, current = 1, n = 1;
        
        while (true) {
            int next = prev + current;
            if (next < 0) // Overflow detected
                break;
            prev = current;
            current = next;
            n++;
        }
        return n;
    }

    // c) Find the largest Fibonacci number that fits in double
    public static int maxFibonacciDouble() {
        double prev = 0.0, current = 1.0;
        int n = 1;
        
        while (true) {
            double next = prev + current;
            if (Double.isInfinite(next)) // Overflow for double
                break;
            prev = current;
            current = next;
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Validate user input
        int n;
        while (true) {
            System.out.print("Enter a non-negative integer n: ");
            if (input.hasNextInt()) {
                n = input.nextInt();
                if (n >= 0) break;
                System.out.println("Please enter a non-negative value.");
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.next(); // Clear invalid input
            }
        }
        
        // Part a
        System.out.printf("Fibonacci(%d) using int = %d%n", n, fibonacciInt(n));
        
        // Part c
        System.out.printf("Fibonacci(%d) using double = %.0f%n", n, fibonacciDouble(n));
        
        // Part b
        int maxIntFibIndex = maxFibonacciInt();
        System.out.printf("Largest Fibonacci index with int: %d, value: %d%n", 
                maxIntFibIndex, fibonacciInt(maxIntFibIndex));
        
        // Part c continued
        int maxDoubleFibIndex = maxFibonacciDouble();
        System.out.printf("Largest Fibonacci index with double: %d, value: %.0f%n", 
                maxDoubleFibIndex, fibonacciDouble(maxDoubleFibIndex));
        
        input.close();
    }
}