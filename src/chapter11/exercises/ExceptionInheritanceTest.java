package chapter11.exercises;
/*
Exercise: 11.17 (Catching Exceptions Using Class Exception) Write a program that demonstrates how various exceptions are caught with
catch (Exception exception)
This time, define classes ExceptionA (which inherits from class Exception) and ExceptionB (which
inherits from class ExceptionA). In your program, create try blocks that throw exceptions of types
ExceptionA, ExceptionB, NullPointerException and IOException. All exceptions should be
caught with catch blocks specifying type Exception.
 */

// Custom exception classes using inheritance
class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

class ExceptionC extends ExceptionB {
    public ExceptionC(String message) {
        super(message);
    }
}

public class ExceptionInheritanceTest {
    public static void main(String[] args) {
        try {
            // You can switch between these to test each exception:
            // throw new ExceptionA("This is ExceptionA.");
            // throw new ExceptionB("This is ExceptionB.");
            throw new ExceptionC("This is ExceptionC.");
        } catch (ExceptionA e) {
            System.out.println("Caught ExceptionA (or subclass): " + e.getMessage());
        }
    }
}
