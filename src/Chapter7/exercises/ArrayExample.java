package Chapter7.exercises;
//Exercise 7.4

public class ArrayExample {
    public static void main(String[] args) {
        // a) Declare and create the array as an integer array with 3 rows and 3 columns
        final int ARRAY_SIZE = 3;
        int[][] table = new int[ARRAY_SIZE][ARRAY_SIZE];

        // c) Initialize each element of the array to the sum of its indices
        for (int x = 0; x < ARRAY_SIZE; x++) {
            for (int y = 0; y < ARRAY_SIZE; y++) {
                table[x][y] = x + y; // Sum of indices
            }
        }

        // Displaying the array for verification
        for (int x = 0; x < ARRAY_SIZE; x++) {
            for (int y = 0; y < ARRAY_SIZE; y++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }
}
