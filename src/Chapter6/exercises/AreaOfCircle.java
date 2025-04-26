package Chapter6.exercises;
/*
    6.20 (Circle Area) Write an application that prompts the user for the radius of a
    circle and uses a method called circleArea to calculate the area of the circle.
 */

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.printf("The area of the circle with radius %.2f is %.2f%n", radius, circleArea(radius));
        input.close();
    }
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
