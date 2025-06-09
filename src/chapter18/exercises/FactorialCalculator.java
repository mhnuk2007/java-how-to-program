package chapter18.exercises;
/*
Exercise 18.10: (Visualizing Recursion) It’s interesting to watch recursion “in action.” Modify the factorial
method in Fig. 18.3 to print its local variable and recursive-call parameter. For each recursive call,
display the outputs on a separate line and add a level of indentation. Do your utmost to make the
outputs clear, interesting and meaningful. Your goal here is to design and implement an output format that makes it easier to understand recursion. You may want to add such display capabilities to
other recursion examples and exercises throughout the text.
 */
// Fig. 18.3: FactorialCalculator.java
// Recursive factorial method with visualization.

public class FactorialCalculator {
    // Recursive method with tracing and indentation
    public static long factorial(long number) {
        return factorial(number, 0);
    }

    // Overloaded method to track recursion depth
    private static long factorial(long number, int depth) {
        // Indentation based on depth level
        String indent = "  ".repeat(depth);

        System.out.printf("%sEntering factorial(%d)%n", indent, number);

        long result;
        if (number <= 1) {
            result = 1;
            System.out.printf("%sBase case reached: factorial(%d) = %d%n", indent, number, result);
        } else {
            result = number * factorial(number - 1, depth + 1);
            System.out.printf("%sReturning: %d * factorial(%d) = %d%n", indent, number, number - 1, result);
        }

        return result;
    }

    // Main method to output factorials for values 0 through 10
    public static void main(String[] args) {
        for (int counter = 0; counter <= 5; counter++) {
            System.out.printf("===> Calculating %d!%n", counter);
            long result = factorial(counter);
            System.out.printf("%d! = %d%n%n", counter, result);
        }
    }
}
