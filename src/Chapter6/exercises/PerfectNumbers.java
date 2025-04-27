package Chapter6.exercises;

/*
    6.24 (Perfect Numbers) An integer number is said to be a perfect number if its factors,
    including 1 (but not the number itself), sum to the number. For example, 6 is a perfect
    number, because 6 = 1 + 2 + 3. Write a method isPerfect that determines whether parameter
    number is a perfect number.
    Use this method in an application that displays all the perfect numbers between 1 and 1000.
    Display the factors of each perfect number to confirm that the number is indeed perfect.
    Challenge the computing power of your computer by testing numbers much larger than 1000.
    Display the results.
 */

public class PerfectNumbers {

    public static void main(String[] args) {
        // Display perfect numbers between 1 and 1000
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int number = 1; number <= 1000; number++) {
            // Check if the current number is a perfect number
            if (isPerfect(number)) {
                System.out.printf("%d is perfect number. Factors: ", number);
                // Display factors of the perfect number
                displayFactors(number);
                System.out.println(); // Move to the next line for next result
            }
        }

        // Testing larger numbers up to 10000
        System.out.println("\nTesting larger numbers (up to 10000):");
        for (int number = 1001; number <= 10000; number++) {
            // Check if the current number is a perfect number
            if (isPerfect(number)) {
                System.out.printf("%d is a perfect number. Factors: ", number);
                // Display factors of the perfect number
                displayFactors(number);
                System.out.println(); // Move to the next line for next result
            }
        }
    }

    // Method to check if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 0;
        // Loop to find all factors of the number (excluding the number itself)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // Add the factor to sum
            }
        }
        // Return true if the sum of factors equals the number
        return sum == number;
    }

    // Method to display factors of a given number
    public static void displayFactors(int number) {
        // Loop to display factors of the number
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + " "); // Print the factor
            }
        }
    }
}
