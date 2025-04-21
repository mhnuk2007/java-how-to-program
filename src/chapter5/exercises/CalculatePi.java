package chapter5.exercises;

/*
    5.20 (Calculating the Value of π) Calculate the value of π from the infinite series
    π = 4/1 - 4/3 + 4/5 - 4/7 + ...
    Print a table that shows the value of π approximated by computing the first 200,000
    terms of this series. How many terms do you have to use before you first get a value
    that begins with 3.14159?
 */
public class CalculatePi {
    public static void main(String[] args) {
        double pi = 0.0;
        int maxTerms = 200000;
        boolean isFound = false;

        for (int i = 1; i <= maxTerms; i++) {
            double term = 4.0 / (2 * i - 1);
            if (i % 2 == 0) {
                pi -= term;
            } else {
                pi += term;
            }
            if (i % 10000 == 0) {
                System.out.printf("Term %d: π ≈ %.6f%n", i, pi);
            }

            // Convert pi to a string with 6 decimal places
            String piString = String.format("%.6f", pi);
            if (!isFound && piString.startsWith("3.14159")) {
                System.out.printf("Pi first reaches 3.14159 after %d terms%n", i);
                isFound=true;
            }

        }
        System.out.printf("Value of pi is approximately: %.5f%n", pi);

    }
}
