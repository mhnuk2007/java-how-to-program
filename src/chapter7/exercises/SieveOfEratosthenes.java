package chapter7.exercises;

/*
7.27 (Sieve of Eratosthenes) A prime number is any integer greater than 1 that's evenly divisible 
only by itself and 1. The Sieve of Eratosthenes is a method of finding prime numbers. It operates 
as follows:
a) Create a primitive-type boolean array with all elements initialized to true. Array elements 
with prime indices will remain true. All other array elements will eventually be set to false.
b) Starting with array index 2, determine whether a given element is true. If so, loop through 
the remainder of the array and set to false every element whose index is a multiple of the 
index for the element with value true. Then continue the process with the next element with 
value true.

For array index 2, all elements beyond element 2 in the array that have indices which are 
multiples of 2 (indices 4, 6, 8, 10, etc.) will be set to false; for array index 3, all 
elements beyond element 3 in the array that have indices which are multiples of 3 (indices 6, 
9, 12, 15, etc.) will be set to false; and so on.

When this process completes, the array elements that are still true indicate that the index is 
a prime number. These indices can be displayed. Write an application that uses an array of 1,000 
elements to determine and display the prime numbers between 2 and 999. Ignore array elements 0 and 1.
*/

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        // Create a boolean array of size 1000 with all elements set to true initially
        boolean[] isPrime = new boolean[1000];
        
        // Initialize all array elements to true (assume all numbers are prime initially)
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        
        // 0 and 1 are not prime numbers
        isPrime[0] = false;
        isPrime[1] = false;
        
        // Implement the Sieve of Eratosthenes algorithm
        for (int i = 2; i < isPrime.length; i++) {
            // If the current number is marked as prime
            if (isPrime[i]) {
                // Mark all multiples of the current number as non-prime
                // Start from i*i as all smaller multiples would have been marked already
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Count the number of primes found
        int primeCount = 0;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primeCount++;
            }
        }
        
        // Display the results
        System.out.println("Prime numbers between 2 and 999 using Sieve of Eratosthenes:");
        System.out.println("Total number of primes found: " + primeCount);
        System.out.println("\nThe prime numbers are:");
        
        // Print primes in rows of 10 numbers for better readability
        int numbersPerRow = 10;
        int count = 0;
        
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.printf("%4d", i);
                count++;
                
                if (count % numbersPerRow == 0) {
                    System.out.println(); // Start a new row
                }
            }
        }
        
        // Add a final newline if the last row wasn't complete
        if (count % numbersPerRow != 0) {
            System.out.println();
        }
        
        // Print some interesting statistics about the prime distribution
        analyzeDistribution(isPrime);
    }
    
    // Additional method to analyze the distribution of primes
    private static void analyzeDistribution(boolean[] isPrime) {
        System.out.println("\nPrime number distribution analysis:");
        
        // Count primes in each hundred
        int[] countByHundred = new int[10];
        
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                int hundred = i / 100;
                if (hundred < 10) {
                    countByHundred[hundred]++;
                }
            }
        }
        
        // Display the distribution
        System.out.println("Number of primes in each range:");
        for (int i = 0; i < countByHundred.length; i++) {
            int start = i * 100;
            int end = start + 99;
            System.out.printf("%3d - %3d: %3d primes\n", start, end, countByHundred[i]);
        }
        
        // Find the largest gap between consecutive primes
        int maxGap = 0;
        int gapStart = 0;
        int lastPrime = 2;
        
        for (int i = 3; i < isPrime.length; i++) {
            if (isPrime[i]) {
                int gap = i - lastPrime;
                if (gap > maxGap) {
                    maxGap = gap;
                    gapStart = lastPrime;
                }
                lastPrime = i;
            }
        }
        
        System.out.printf("\nLargest gap between consecutive primes: %d (between %d and %d)\n", 
                maxGap, gapStart, gapStart + maxGap);
    }
}