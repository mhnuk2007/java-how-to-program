package Chapter6.exercises;
/*
    6.27 (Greatest Common Divisor) The greatest common divisor (GCD) of two integers is
    the largest integer that evenly divides each of the two numbers. Write a method gcd
    that returns the greatest common divisor of two integers. [Hint: You might want to
    use Euclid’s algorithm. You can find information about it at
    en.wikipedia.org/wiki/Euclidean_algorithm.] Incorporate the method into an application
    that reads two values from the user and displays the result.
 */


import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Calculate and display the GCD
        int gcd = gcd(num1, num2);
        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is: " + gcd);
        input.close();
    }

    // Method to calculate GCD using Euclid's Algorithm
    public static int gcd(int a, int b) {
        // Base case: If b is 0, return a (GCD is found)
        while (b != 0) {
            // Euclid's algorithm step: a becomes b, and b becomes the remainder of a divided by b
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // Return the final GCD
    }

}
