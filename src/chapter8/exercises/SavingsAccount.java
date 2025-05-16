package chapter8.exercises;
/*
Exercise: 8.6 (Savings Account Class) Create class SavingsAccount. Use a static variable annualInterestRate to store the annual interest rate for all account holders. Each object of the class contains a
private instance variable savingsBalance indicating the amount the saver currently has on deposit.
Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the
savingsBalance by annualInterestRate divided by 12—this interest should be added to savingsBalance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new
value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate
to 4%, then calculate the monthly interest for each of 12 months and print the new balances for
both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
the new balances for both savers.
 */
public class SavingsAccount {

    private static double annualInterestRate; // same for all accounts
    private double savingsBalance;           // individual balance for each saver

    // Constructor
    public SavingsAccount(double savingsBalance) {
        if (savingsBalance < 0.0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.savingsBalance = savingsBalance;
    }

    // Method to calculate and add monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify interest rate for all accounts
    public static void modifyInterestRate(double newAnnualInterestRate) {
        if (newAnnualInterestRate < 0.0 || newAnnualInterestRate > 1.0) {
            throw new IllegalArgumentException("Interest rate must be between 0 and 1");
        }
        annualInterestRate = newAnnualInterestRate;
    }

    // Getter for balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
} // end class SavingsAccount

class SavingsAccountTest {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Balances with 4% annual interest:");
        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("Month %2d: Saver1 = $%.2f, Saver2 = $%.2f%n",
                    month, saver1.getSavingsBalance(), saver2.getSavingsBalance());
        }

        // Set interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Next month's interest
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nBalances with 5% annual interest (after one more month):");
        System.out.printf("Month 13: Saver1 = $%.2f, Saver2 = $%.2f%n",
                saver1.getSavingsBalance(), saver2.getSavingsBalance());
    }
} // end class SavingsAccountTest
