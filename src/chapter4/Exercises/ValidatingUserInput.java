package chapter4.Exercises;
/*
    4.24 (Validating User Input) Modify the program in Fig. 4.12 to validate its inputs.
    For any input, if the value entered is other than 1 or 2, keep looping until the user
    enters a correct value.
 */

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initializing variables in declarations
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        // process 10 students using counter-controlled loop
        while (studentCounter <= 10) {
            // prompt user for input and obtain value from user
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            while (result != 1 && result != 2) { //Validating user input
                System.out.println("Invalid input. Please enter 1 or 2: ");
                result = input.nextInt();
            }
            if (result == 1) {
                passes = passes + 1;
            } else {
                failures = failures + 1;
            }
            // increment studentCounter so loop eventually terminates
            studentCounter = studentCounter + 1;
        }
        // termination phase; prepare and display results
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        // determine whether more than 8 students passed
        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}
