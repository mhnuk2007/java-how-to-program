package Chapter6.exercises;
/*
    6.25 (Prime Numbers) A positive integer is prime if it’s divisible by only 1 and
    itself. For example, 2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1,
    by definition, is not prime.
        a) Write a method that determines whether a number is prime.
        b) Use this method in an application that determines and displays all the prime
        numbers less than 10,000. How many numbers up to 10,000 do you have to test to
        ensure that you’ve found all the primes?
        c) Initially, you might think that n/2 is the upper limit for which you must test
        to see whether a number n is prime, but you need only go as high as the square root
        of n. Rewrite the program, and run it both ways.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10,000:");

        int primeCount = 0; // Counter to count the number of prime numbers found

        // Loop through numbers from 2 up to 9999
        for (int number = 2; number < 10000; number++) {
            // Check if current number is prime
            if (isPrime(number)) {
                System.out.print(number + " "); // Display the prime number
                primeCount++; // Increment prime counter
            }
        }

        // Print the total number of primes found
        System.out.printf("%nTotal number of primes less than 10,000: %d%n", primeCount);
    }

    // Method to determine whether a number is prime
    public static boolean isPrime(int number) {
        // 1 is not a prime number
        if (number == 1) {
            return false;
        }

        // Check divisibility from 2 up to square root of the number
        // Calculate the square root of the number
        int sqrt = (int) Math.sqrt(number);
        // Check divisibility from 2 up to sqrt(number)
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        }

        return true; // Number is prime
    }
}
