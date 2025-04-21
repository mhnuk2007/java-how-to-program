package chapter5.exercises;

/*
    5.14 (Modified Compound-Interest Program) — Display compound interest amounts
    side-by-side for interest rates from 5% to 10% over 10 years.
 */
public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;

        // Print header row
        System.out.printf("%-6s", "Year");
        for (int rate = 5; rate <= 10; rate++) {
            System.out.printf("%10s", rate + "%");
        }
        System.out.println();

        // Print each year row
        for (int year = 1; year <= 10; year++) {
            System.out.printf("%-6d", year); // Year column

            for (int rate = 5; rate <= 10; rate++) {
                double interestRate = rate / 100.0;
                double amount = principal * Math.pow(1.0 + interestRate, year);
                System.out.printf("%10.2f", amount); // Amount columns
            }

            System.out.println(); // New line after each year
        }
    }
}
