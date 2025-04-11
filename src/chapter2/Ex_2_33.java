package chapter2;
/*
    2.33 (Body Mass Index Calculator) We introduced the body mass index (BMI) calculator
    in Exercise 1.10. The formulas for calculating BMI are
    BMI = (weightInPounds * 703)/(heightInInches * heightInInches)
    or
     BMI = (weightInKilograms)/(heightInMeters * heightInMeters)
    Create a BMI calculator that reads the user’s weight in pounds and height in inches
    (or, if you prefer, the user’s weight in kilograms and height in meters), then
    calculates and displays the user’s body mass index. Also, display the following
    information from the Department of Health and Human Services/National Institutes of
    Health so the user can evaluate his/her BMI:
    BMI VALUES
    Underweight: less than 18.5
    Normal: between 18.5 and 24.9
    Overweight: between 25 and 29.9
    Obese: 30 or greater
    [Note: In this chapter, you learned to use the int type to represent whole numbers.
    The BMI calculations when done with int values will both produce whole-number results.
    In Chapter 3 you’ll learn to use the double type to represent numbers with decimal
    points. When the BMI calculations are performed with doubles, they’ll both produce
    numbers with decimal points—these are called “floating-point” numbers.]
 */

import java.util.Scanner;

public class Ex_2_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weightInPounds;
        int heightInInches;
        int bmi;

        System.out.print("Enter your weight in pounds: ");
        weightInPounds = input.nextInt();

        System.out.print("Enter your height in inches: ");
        heightInInches = input.nextInt();

        bmi = (weightInPounds * 703) / (heightInInches * heightInInches);

        System.out.println("\nYour Body Mass Index (BMI) is: " + bmi);

        System.out.println("\nBMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
}