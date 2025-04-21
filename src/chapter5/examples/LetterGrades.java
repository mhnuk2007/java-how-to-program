package chapter5.examples;
// Fig. 5.9: LetterGrades.java
// LetterGrades class uses the switch statement to count letter grades.

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        int total = 0;              // sum of all grades
        int gradeCounter = 0;       // number of grades entered
        int aCount = 0;             // count of A grades (90–100)
        int bCount = 0;             // count of B grades (80–89)
        int cCount = 0;             // count of C grades (70–79)
        int dCount = 0;             // count of D grades (60–69)
        int fCount = 0;             // count of F grades (0–59)

        Scanner input = new Scanner(System.in);

        // Prompt for user input
        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        // Read grades until EOF
        while (input.hasNext()) {int grade = input.nextInt();
            total += grade;              // add to total
            ++gradeCounter;              // increment grade count

            // Classify grade using switch
            switch (grade / 10) {
                case 9:  // 90–99
                case 10: // 100
                    ++aCount;
                    break;
                case 8:  // 80–89
                    ++bCount;
                    break;
                case 7:  // 70–79
                    ++cCount;
                    break;
                case 6:  // 60–69
                    ++dCount;
                    break;
                default: // 0–59
                    ++fCount;
                    break;
            }
        }

        System.out.printf("%nGrade Report:%n");

        // Check if any grades were entered
        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter; // calculate average

            // Print summary report
            System.out.printf("Total of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);
        } else {
            // No grades were entered
            System.out.println("No grades were entered");
        }
    }
}
