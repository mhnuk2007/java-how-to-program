package Chapter6.exercises;
/*
    6.3 Write an application that tests whether the examples of the Math class method
    calls shown in Fig. 6.2 actually produce the indicated results.
 */

public class MathMethods {
    public static void main(String[] args) {
        // abs
        System.out.printf("abs(23.7) = %.1f%n", Math.abs(23.7));           // 23.7
        System.out.printf("abs(0.0) = %.1f%n", Math.abs(0.0));             // 0.0
        System.out.printf("abs(-23.7) = %.1f%n%n", Math.abs(-23.7));       // 23.7

        // ceil
        System.out.printf("ceil(9.2) = %.1f%n", Math.ceil(9.2));           // 10.0
        System.out.printf("ceil(-9.8) = %.1f%n%n", Math.ceil(-9.8));       // -9.0

        // cos
        System.out.printf("cos(0.0) = %.1f%n%n", Math.cos(0.0));           // 1.0

        // exp
        System.out.printf("exp(1.0) = %.5f%n", Math.exp(1.0));             // ~2.71828
        System.out.printf("exp(2.0) = %.5f%n%n", Math.exp(2.0));           // ~7.38906

        // floor
        System.out.printf("floor(9.2) = %.1f%n", Math.floor(9.2));         // 9.0
        System.out.printf("floor(-9.8) = %.1f%n%n", Math.floor(-9.8));     // -10.0

        // log
        System.out.printf("log(Math.E) = %.1f%n", Math.log(Math.E));       // 1.0
        System.out.printf("log(Math.E * Math.E) = %.1f%n%n", Math.log(Math.E * Math.E)); // 2.0

        // max
        System.out.printf("max(2.3, 12.7) = %.1f%n", Math.max(2.3, 12.7));         // 12.7
        System.out.printf("max(-2.3, -12.7) = %.1f%n%n", Math.max(-2.3, -12.7));   // -2.3

        // min
        System.out.printf("min(2.3, 12.7) = %.1f%n", Math.min(2.3, 12.7));         // 2.3
        System.out.printf("min(-2.3, -12.7) = %.1f%n%n", Math.min(-2.3, -12.7));   // -12.7

        // pow
        System.out.printf("pow(2.0, 7.0) = %.1f%n", Math.pow(2.0, 7.0));           // 128.0
        System.out.printf("pow(9.0, 0.5) = %.1f%n%n", Math.pow(9.0, 0.5));         // 3.0

        // sin
        System.out.printf("sin(0.0) = %.1f%n%n", Math.sin(0.0));                   // 0.0

        // sqrt
        System.out.printf("sqrt(900.0) = %.1f%n%n", Math.sqrt(900.0));            // 30.0

        // tan
        System.out.printf("tan(0.0) = %.1f%n", Math.tan(0.0));                     // 0.0
    }
}
