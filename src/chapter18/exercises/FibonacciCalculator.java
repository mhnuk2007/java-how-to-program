package chapter18.exercises;
/*
Exercise 18.23 (Time to Calculate Fibonacci Numbers) Enhance the Fibonacci program of
Fig. 18.5 so that it calculates the approximate amount of time required to perform the
calculation and the number of calls made to the recursive method. For this purpose,
call static System method currentTimeMillis, which takes no arguments and returns the
computer’s current time in milliseconds.
Call this method twice—once before and once after the call to fibonacci.
Save each value and calculate the difference in the times to determine how many
milliseconds were required to perform the calculation. Then, add a variable to the
FibonacciCalculator class, and use this variable to determine the number of calls
made to method fibonacci. Display your results.
 */

public class FibonacciCalculator {

    // Variable to count the number of recursive calls
    private static long callCount = 0;

    // Recursive Fibonacci method
    public static long fibonacci(int n) {
        callCount++; // Increment call count on each call

        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 40; // Change this for different Fibonacci numbers

        // Capture start time in milliseconds
        long startTime = System.currentTimeMillis();

        // Calculate Fibonacci number
        long fibNumber = fibonacci(n);

        // Capture end time in milliseconds
        long endTime = System.currentTimeMillis();

        // Calculate elapsed time
        long elapsedTime = endTime - startTime;

        // Display results
        System.out.printf("Fibonacci number for n = %d is %d%n", n, fibNumber);
        System.out.printf("Number of recursive calls made: %d%n", callCount);
        System.out.printf("Time taken to compute: %d milliseconds%n", elapsedTime);
    }
}
