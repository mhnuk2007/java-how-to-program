package chapter11.exercises;
/*
Exercise: 11.20 (Rethrowing Exceptions) Write a program that illustrates rethrowing an exception. Define
methods someMethod and someMethod2. Method someMethod2 should initially throw an exception.
Method someMethod should call someMethod2, catch the exception and rethrow it. Call someMethod
from method main, and catch the rethrown exception. Print the stack trace of this exception.
 */

public class RethrowExceptionTest {

    public static void someMethod2() throws Exception {
        // Throw an exception initially
        throw new Exception("Exception thrown from someMethod2");
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Exception caught in someMethod, rethrowing...");
            throw e;  // Rethrow the caught exception
        }
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Exception caught in main:");
            e.printStackTrace();  // Print stack trace
        }
    }
}
