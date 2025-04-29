package Chapter7.examples;

// Fig. 7.6: BarChart.java
// Bar chart printing program.

public class BarChart {
    public static void main(String[] args) {
        // Array containing frequency of grades in each range
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("Grade distribution:");

        // For each array element, output a bar of the chart
        for (int counter = 0; counter < array.length; counter++) {
            // Output bar label ("00-09: ", ..., "90-99: ", "100: ")
            if (counter == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
            }

            // Print asterisks corresponding to the count in that range
            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after printing stars
        }
    }
} // end class BarChart
