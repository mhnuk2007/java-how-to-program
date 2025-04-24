package chapter3.exercises;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input user details
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter birth day (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter birth month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter birth year: ");
        int year = input.nextInt();

        // Create HeartRates object
        HeartRates hr = new HeartRates(firstName, lastName, day, month, year);

        // Display info
        System.out.println("\n--- Heart Rate Info ---");
        System.out.printf("Name: %s %s%n", hr.getFirstName(), hr.getLastName());
        System.out.printf("Date of Birth: %d/%d/%d%n", hr.getBirthDay(), hr.getBirthMonth(), hr.getBirthYear());
        System.out.printf("Age: %d years%n", hr.getAge());
        System.out.printf("Maximum Heart Rate: %d bpm%n", hr.getMaxHeartRate());
        System.out.printf("Target Heart Rate Range: %s%n", hr.getTargetHeartRate());
    }
}
