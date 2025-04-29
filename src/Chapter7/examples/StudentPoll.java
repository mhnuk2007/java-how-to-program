package Chapter7.examples;

// Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in the
// student cafeteria, with 1 being “awful” and 5 being “excellent.” Place the 20 responses
// in an integer array and determine the frequency of each rating.

// Fig. 7.8: StudentPoll.java
// Poll analysis program.

public class StudentPoll {
    public static void main(String[] args) {
        // student response array (in real apps, this would be user input)
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};

        int[] frequency = new int[6]; // frequency[1] to frequency[5], index 0 unused

        // Count each valid rating (1 to 5); catch invalid ratings like 14
        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid rating found: " + e); // detailed exception info
                System.out.printf("  responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }

        // Print rating and corresponding frequency
        System.out.printf("%s%10s%n", "Rating", "Frequency");
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }
    }
} // end class StudentPoll
