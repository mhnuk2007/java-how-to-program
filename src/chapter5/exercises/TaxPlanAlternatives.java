package chapter5.exercises;
/*
    5.32 (Tax Plan Alternatives; The “FairTax”) There are many proposals to make taxation
    fairer. Check out the FairTax initiative in the United States at www.fairtax.org.
    Research how the proposed FairTax works. One suggestion is to eliminate income taxes
    and most other taxes in favor of a 23% consumption tax on all products and services
    that you buy. Some FairTax opponents question the 23% figure and say that because of
    the way the tax is calculated, it would be more accurate to say the rate is 30%—check
    this carefully. Write a program that prompts the user to enter expenses in various
    expense categories they have (e.g., housing, food, clothing, transportation, education,
    health care, vacations), then prints the estimated FairTax that person would pay.
 */

import java.util.Scanner;

public class TaxPlanAlternatives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double housing, food, clothing, transport, education, healthCare, vacations;

        System.out.println("Welcome to the FairTax Calculator");
        System.out.println("Please enter your annual expenses for the following categories:\n");

        System.out.print("Housing: $");
        housing = input.nextDouble();

        System.out.print("Food: $");
        food = input.nextDouble();

        System.out.print("Clothing: $");
        clothing = input.nextDouble();

        System.out.print("Transportation: $");
        transport = input.nextDouble();

        System.out.print("Education: $");
        education = input.nextDouble();

        System.out.print("Health Care: $");
        healthCare = input.nextDouble();

        System.out.print("Vacations: $");
        vacations = input.nextDouble();

        double total = housing + food + clothing + transport + education + healthCare + vacations;
        double fairTax = total * 0.23;
        double taxOpponents = total * 0.30;

        System.out.printf("%nYour total annual spending: $%.2f%n", total);
        System.out.printf("Estimated FairTax (23%%): $%.2f%n", fairTax);
        System.out.printf("Estimated Tax (Critics' View - 30%%): $%.2f%n", taxOpponents);

        input.close();
    }
}