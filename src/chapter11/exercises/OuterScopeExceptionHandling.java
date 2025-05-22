package chapter11.exercises;
/*
Exercise: 11.21 (Catching Exceptions Using Outer Scopes) Write a program showing that a method with its
own try block does not have to catch every possible error generated within the try. Some exceptions
can slip through to, and be handled in, other scopes. 
 */

public class OuterScopeExceptionHandling {

    public static void methodWithTry() {
        try {
            System.out.println("Inside methodWithTry");
            // Throw an exception that is caught here
            throw new IllegalArgumentException("Illegal argument in methodWithTry");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException in methodWithTry: " + e.getMessage());
        }
        
        // This exception is NOT caught here and will propagate outward
        throw new NullPointerException("Null pointer exception slips through methodWithTry");
    }

    public static void main(String[] args) {
        try {
            methodWithTry();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in main: " + e.getMessage());
        }
    }
}
