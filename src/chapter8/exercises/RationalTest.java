package chapter8.exercises;
/*
Exercise: this class to be initialized when it’s declared. The constructor should store the fraction in reduced
form. The fraction
2/4
is equivalent to 1/2 and would be stored in the object as 1 in the numerator and 2 in the denominator. Provide a no-argument constructor with default values in case no initializers are provided. Provide public methods that perform each of the following operations:
a) Add two Rational numbers: The result of the addition should be stored in reduced
form. Implement this as a static method.
b) Subtract two Rational numbers: The result of the subtraction should be stored in reduced form. Implement this as a static method.
c) Multiply two Rational numbers: The result of the multiplication should be stored in
reduced form. Implement this as a static method.
d) Divide two Rational numbers: The result of the division should be stored in reduced
form. Implement this as a static method.
e) Return a String representation of a Rational number in the form a/b, where a is the
numerator and b is the denominator.
f) Return a String representation of a Rational number in floating-point format. (Consider providing formatting capabilities that enable the user of the class to specify the
number of digits of precision to the right of the decimal point.)
 */
class Rational {
    private int numerator;
    private int denominator;

    // No-argument constructor with default value 0/1
    public Rational() {
        this(0, 1);
    }

    // Constructor with parameters (auto-reduced)
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }

        // Handle negative sign
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    // GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // Static method: Add
    public static Rational add(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int denom = r1.denominator * r2.denominator;
        return new Rational(num, denom);
    }

    // Static method: Subtract
    public static Rational subtract(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int denom = r1.denominator * r2.denominator;
        return new Rational(num, denom);
    }

    // Static method: Multiply
    public static Rational multiply(Rational r1, Rational r2) {
        int num = r1.numerator * r2.numerator;
        int denom = r1.denominator * r2.denominator;
        return new Rational(num, denom);
    }

    // Static method: Divide
    public static Rational divide(Rational r1, Rational r2) {
        if (r2.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        int num = r1.numerator * r2.denominator;
        int denom = r1.denominator * r2.numerator;
        return new Rational(num, denom);
    }

    // toString in a/b format
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Floating-point string with default precision (2 decimal places)
    public String toFloatingPointString() {
        return String.format("%.2f", (double) numerator / denominator);
    }

    // Floating-point string with custom precision
    public String toFloatingPointString(int precision) {
        String format = "%." + precision + "f";
        return String.format(format, (double) numerator / denominator);
    }
}

public class RationalTest {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 4);   // reduced to 1/2
        Rational r2 = new Rational(3, 5);   // 3/5

        System.out.println("Rational 1: " + r1);
        System.out.println("Rational 2: " + r2);

        Rational sum = Rational.add(r1, r2);
        System.out.println("Sum: " + sum + " = " + sum.toFloatingPointString(3));

        Rational difference = Rational.subtract(r1, r2);
        System.out.println("Difference: " + difference + " = " + difference.toFloatingPointString(3));

        Rational product = Rational.multiply(r1, r2);
        System.out.println("Product: " + product + " = " + product.toFloatingPointString(3));

        Rational quotient = Rational.divide(r1, r2);
        System.out.println("Quotient: " + quotient + " = " + quotient.toFloatingPointString(3));
    }
}