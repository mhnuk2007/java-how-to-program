package chapter2;
/*
    2.28 (Diameter, Circumference and Area of a Circle) Here’s a peek ahead.
    In this chapter, you learned about integers and the type int. Java can also
    represent floating-point numbers that contain decimal points, such as 3.14159.
    Write an application that inputs from the user the radius of a circle as an integer
    and prints the circle’s diameter, circumference and area using the floating-point
    value 3.14159 for π. Use the techniques shown in Fig. 2.7.
    [Note: You may also use the predefined constant Math.PI for the value of π.
    This constant is more precise than the value 3.14159. Class Math is defined in
    package java.lang. Classes in that package are imported automatically, so you do
    not need to import class Math to use it.] Use the following formulas
    (r is the radius): diameter = 2r circumference = 2πr area = πr2
    Do not store the results of each calculation in a variable. Rather, specify each
    calculation as the value that will be output in a System.out.printf statement.
    The values produced by the circumference and area calculations are floating-point
    numbers. Such values can be output with the format specifier %f in a System.out.printf
    statement. You’ll learn more about floating-point numbers in Chapter 3.
 */

import java.util.Scanner;

public class Ex_2_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;
        double pi = Math.PI;

        System.out.print("Enter radius of the circle: ");
        radius = input.nextInt();
        System.out.printf("Diameter: %.2f%n", (double)2*radius);
        System.out.printf("Circumference: %.2f%n", 2*pi*radius );
        System.out.printf("Area: %.2f", pi*radius*radius);


    }
}
