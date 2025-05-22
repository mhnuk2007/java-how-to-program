package chapter11.exercises;
/*
Exercise: 11.18 (Order of catch Blocks) Write a program demonstrating that the order of catch blocks is
important. If you try to catch a superclass exception type before a subclass type, the compiler should
generate errors.
 */

public class CatchOrderDemo {

    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Demo: Division by zero");
        }

        /*
         * ❌ This catch block will cause a **compile-time error** because
         * ArithmeticException is a subclass of RuntimeException, which appears *after* it.
         */
        /*
        catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }

        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        */

        // ✅ Correct order: catch subclass first
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
