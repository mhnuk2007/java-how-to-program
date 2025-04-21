package chapter5.exercises;

/*
    5.14 (Modified Compound-Interest Program) Modify the compound-interest application
    of Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%.
    Use a for loop to vary the interest rate.
 */

public class CompoundInterest {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;

        for (int rate = 5; rate <= 10; rate++) {
            double interestRate = rate / 100.0;

            System.out.printf("%nInterest Rate: %d%%%n", rate);
            System.out.printf("%-4s%25s%n", "Year", "Amount on deposit");

            for (int year = 1; year <= 10; year++) {
                amount = principal * Math.pow(1.0 + interestRate, year);
                System.out.printf("%-4d%,25.2f%n", year, amount);
            }
        }
    }
}
