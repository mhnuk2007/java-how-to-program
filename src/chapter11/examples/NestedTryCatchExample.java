package chapter11.examples;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block started.");

            try {
                int result = 10 / 0; // Causes ArithmeticException
                System.out.println("Inner try result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught in inner catch: " + e);
            }

            String str = null;
            System.out.println(str.length()); // Causes NullPointerException

        } catch (NullPointerException e) {
            System.out.println("Caught in outer catch: " + e);
        }

        System.out.println("Program continues...");
    }
}
