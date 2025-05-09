package Chapter7.exercises;

/*
Exercise 7.16 (Using the Enhanced for Statement)
Write an application that uses an enhanced for statement to sum the double values
passed by the command-line arguments.
Hint: Use Double.parseDouble to convert a String to a double value.
*/

public class SumCommandLineDoubles {
    public static void main(String[] args) {
        double total = 0.0; // Variable to store the sum

        // Enhanced for loop to process each argument
        for (String arg : args) {
            try {
                // Attempt to parse each argument as a double
                double value = Double.parseDouble(arg);
                total += value; // Add to total if valid
            } catch (NumberFormatException e) {
                // Inform user of invalid input and continue
                System.out.printf("'%s' is not a valid double. Skipping it.%n", arg);
            }
        }

        // Display the final total sum
        System.out.printf("Total sum of command-line double values: %.2f%n", total);
    }
}