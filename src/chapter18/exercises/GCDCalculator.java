package chapter18.exercises;
/*
Exercise 18.11: (Greatest Common Divisor) The greatest common divisor of integers x and y is the largest
integer that evenly divides into both x and y. Write a recursive method gcd that returns the greatest
common divisor of x and y. The gcd of x and y is defined recursively as follows: If y is equal to 0,
then gcd(x, y) is x; otherwise, gcd(x, y) is gcd(y, x % y), where % is the remainder operator. Use
this method to replace the one you wrote in the application of Exercise 6.27.
 */

public class GCDCalculator {

    // Recursive method to compute gcd of x and y
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;  // Base case
        } else {
            return gcd(y, x % y);  // Recursive call
        }
    }

    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        System.out.printf("GCD of %d and %d is %d%n", a, b, gcd(a, b));
    }
}
