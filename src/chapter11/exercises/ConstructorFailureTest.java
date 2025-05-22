package chapter11.exercises;
/*
Exercise: 11.19 (Constructor Failure) Write a program that shows a constructor passing information about
constructor failure to an exception handler. Define class SomeClass, which throws an Exception in
the constructor. Your program should try to create an object of type SomeClass and catch the exception that’s thrown from the constructor.
 */

// Custom exception class for constructor failure
class ConstructorException extends Exception {
    public ConstructorException(String message) {
        super(message);
    }
}

// Class that throws an exception in its constructor
class SomeClass {
    public SomeClass() throws ConstructorException {
        // Simulate a failure in constructor
        throw new ConstructorException("Constructor failed: unable to create SomeClass instance.");
    }
}

public class ConstructorFailureTest {
    public static void main(String[] args) {
        try {
            SomeClass obj = new SomeClass();
        } catch (ConstructorException e) {
            System.out.println("Caught exception from constructor: " + e.getMessage());
        }
    }
}
