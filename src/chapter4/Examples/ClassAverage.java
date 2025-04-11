//Implementing sentinel-Controlled Repetition
package chapter4.Examples;
// Fig. 4.10: ClassAverage.java
// Solving the class-average problem using sentinel-controlled repetition.


import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initialization phase
        int total = 0;
        int gradeCounter = 0;

        //processing phase
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        // loop under sentinel value read from user
        while (grade != -1) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            // prompt for input
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }

        // termination phase
        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            // display total and average of grades
            System.out.printf("%nTotal of %d grades is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        } else {
            System.out.println("No grades were entered");
        }
        input.close();
    }
}
