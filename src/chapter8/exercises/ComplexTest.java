package chapter8.exercises;
/*
Exercise: 8.11 (Complex Numbers) Create a class called Complex for performing arithmetic with complex
numbers. Complex numbers have the form
realPart + imaginaryPart \* i
where i is sqrt(-1)
Write a program to test your class. Use floating-point variables to represent the private data of the
class. Provide a constructor that enables an object of this class to be initialized when it’s declared.
Provide a no-argument constructor with default values in case no initializers are provided. Provide
public methods that perform the following operations:
a) Add two Complex numbers: The real parts are added together and the imaginary parts
are added together.
b) Subtract two Complex numbers: The real part of the right operand is subtracted from
the real part of the left operand, and the imaginary part of the right operand is subtracted from the imaginary part of the left operand.
c) Print Complex numbers in the form (realPart, imaginaryPart).
 */

class Complex {
    private double real;
    private double imaginary;

    // Constructor with parameters
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // No-argument constructor (defaults to 0 + 0i)
    public Complex() {
        this(0.0, 0.0);
    }

    // Add another Complex number and return the result
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Subtract another Complex number and return the result
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Return a string in the form (real, imaginary)
    public String toString() {
        return String.format("(%.2f, %.2f)", real, imaginary);
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(3.5, 2.0);
        Complex c2 = new Complex(1.5, 4.5);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);

        System.out.println("First complex number: " + c1);
        System.out.println("Second complex number: " + c2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
