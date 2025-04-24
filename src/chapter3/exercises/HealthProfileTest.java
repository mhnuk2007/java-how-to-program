package chapter3.exercises;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting for input
        System.out.print("First Name: ");
        String firstName = input.nextLine();

        System.out.print("Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Gender: ");
        String gender = input.nextLine();

        System.out.print("Birth Day: ");
        int day = input.nextInt();

        System.out.print("Birth Month: ");
        int month = input.nextInt();

        System.out.print("Birth Year: ");
        int year = input.nextInt();

        System.out.print("Height in inches: ");
        double height = input.nextDouble();

        System.out.print("Weight in pounds: ");
        double weight = input.nextDouble();

        // Creating HealthProfile object
        HealthProfile profile = new HealthProfile(firstName, lastName, gender, day, month, year, height, weight);

        // Display results
        System.out.println("\n--- Health Profile ---");
        System.out.printf("Name: %s %s%n", profile.getFirstName(), profile.getLastName());
        System.out.printf("Gender: %s%n", profile.getGender());
        System.out.printf("Date of Birth: %d/%d/%d%n", profile.getBirthMonth(), profile.getBirthDay(), profile.getBirthYear());
        System.out.printf("Height: %.1f inches%n", profile.getHeightInInches());
        System.out.printf("Weight: %.1f pounds%n", profile.getWeightInPounds());

        System.out.printf("Age: %d years%n", profile.getAge());
        System.out.printf("BMI: %.2f%n", profile.getBMI());
        System.out.printf("Maximum Heart Rate: %d bpm%n", profile.getMaxHeartRate());
        System.out.printf("Target Heart Rate Range: %s%n", profile.getTargetHeartRateRange());

        HealthProfile.displayBMIChart();
    }
}
