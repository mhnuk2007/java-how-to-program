package chapter6.examples;
// Fig. 6.10: MethodOverload.java
// Overloaded method declarations.

public class MethodOverload {
    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is %d%n", square(7) );
        System.out.printf("Square of double 7.5 is %f%n", square(7.5) );

    }

    // square method with int argument
    public static int square(int intValue) {
        System.out.printf("%nCalled square with int argument: %d%n",
                intValue);
        return intValue * intValue;
    }

    // square method with double argument
    public static double square(double doubleValue) {
        System.out.printf("%nCalled square with double argument: %.2f%n",
                doubleValue);
        return doubleValue * doubleValue;
    }
}
