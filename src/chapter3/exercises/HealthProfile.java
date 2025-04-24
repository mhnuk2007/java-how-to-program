package chapter3.exercises;
/*
    3.17 (Computerization of Health Records) A health-care issue that has been in the
    news lately is the computerization of health records. This possibility is being
    approached cautiously because of sensitive privacy and security concerns, among others.
    [We address such concerns in later exercises.] Computerizing health records could make
    it easier for patients to share their health profiles and histories among their various
    health-care professionals. This could improve the quality of health care, help avoid
    drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies,
    could save lives. In this exercise, you’ll design a “starter” HealthProfile class for
    a person. The class attributes should include the person’s first name, last name,
    gender, date of birth (consisting of separate
 */

import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private double heightInInches;
    private double weightInPounds;

    public HealthProfile(String firstName, String lastName, String gender,
                         int birthDay, int birthMonth, int birthYear,
                         double heightInInches, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    // Getters and setters for each field

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public int getBirthDay() { return birthDay; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }

    public int getBirthMonth() { return birthMonth; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public double getHeightInInches() { return heightInInches; }
    public void setHeightInInches(double heightInInches) { this.heightInInches = heightInInches; }

    public double getWeightInPounds() { return weightInPounds; }
    public void setWeightInPounds(double weightInPounds) { this.weightInPounds = weightInPounds; }

    // Method to calculate age
    public int getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        return Period.between(birthDate, today).getYears();
    }

    // Maximum Heart Rate
    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    // Target Heart Rate Range
    public String getTargetHeartRateRange() {
        double min = getMaxHeartRate() * 0.50;
        double max = getMaxHeartRate() * 0.85;
        return String.format("%.1f - %.1f bpm", min, max);
    }

    // BMI calculation
    public double getBMI() {
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }

    // Method to display BMI chart
    public static void displayBMIChart() {
        System.out.println("\nBMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
}
