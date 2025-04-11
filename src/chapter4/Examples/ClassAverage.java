package chapter4.Examples;
// Fig. 4.8: ClassAverage.java
// Solving the class-average problem using counter-controlled repetition.

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initialization phase
        int total = 0;
        int gradeCounter = 1;

        // processing phase uses counter-controlled repetition
        while (gradeCounter <= 10) {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        // termination phase
        int average = total / 10;

        // display total and average of grades
        System.out.printf("%nTotal of 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }
}
