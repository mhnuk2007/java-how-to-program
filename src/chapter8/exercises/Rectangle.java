package chapter8.exercises;
/*
Exercise: 8.4 (Rectangle Class) Create a class Rectangle with attributes length and width, each of which
defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
methods for both length and width. The set methods should verify that length and width are each
floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.
 */

public class Rectangle {
    // Attributes
    private double length = 1.0;
    private double width = 1.0;

    // Constructor
    public Rectangle() {
        // defaults already set above
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Setter for length
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Invalid length. It must be > 0.0 and < 20.0");
        }
    }

    // Setter for width
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Invalid width. It must be > 0.0 and < 20.0");
        }
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Calculate area
    public double calculateArea() {
        return length * width;
    }
} // end class Rectangle

class RectangleTest {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle();

        // Display default values
        System.out.printf("Default Length: %.2f%n", rectangle.getLength());
        System.out.printf("Default Width: %.2f%n", rectangle.getWidth());
        System.out.printf("Default Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Default Perimeter: %.2f%n%n", rectangle.calculatePerimeter());

        // Set valid values
        rectangle.setLength(10.5);
        rectangle.setWidth(5.5);

        // Display updated values
        System.out.printf("Updated Length: %.2f%n", rectangle.getLength());
        System.out.printf("Updated Width: %.2f%n", rectangle.getWidth());
        System.out.printf("Updated Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Updated Perimeter: %.2f%n%n", rectangle.calculatePerimeter());

        // Try setting invalid values
        rectangle.setLength(25.0);  // should show warning
        rectangle.setWidth(-3.0);   // should show warning
    }
} // end class RectangleTest

