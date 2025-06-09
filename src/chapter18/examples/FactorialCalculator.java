package chapter18.examples;
// Fig. 18.3: FactorialCalculator.java
// Recursive factorial method.

public class FactorialCalculator {
    // recursive method factorial (assumes its parameter is >= 0)
    public static long factorial(int number) {
        if (number <= 1) { // test for base case
            return 1; // base cases: 0! = 1 and 1! = 1
        } else { //recursion step
            return number * factorial(number - 1); // recursive call
        }

    }

    // output factorials for values 0-21
    public static void main(String[] args) {
        for (int counter = 0; counter <= 21; counter++){
            System.out.printf("%d! = %d%n", counter, factorial(counter));
        }
    }
} // end class FactorialCalculator
