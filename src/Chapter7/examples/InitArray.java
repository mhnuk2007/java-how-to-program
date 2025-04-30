package Chapter7.examples;

// Fig. 7.17: InitArray.java
// Initializing two-dimensional arrays.
public class InitArray {
    // create and output two-dimensional arrays
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Value in array1 by row are");
        outPutArray(array1); // displays array 1 by row

        System.out.println("Value in array2 by row are");
        outPutArray(array2); // displays array 2 by row
    }

    // output rows and columns of a two-dimensional array
    public static void outPutArray(int[][] array) {
        // loop through array's rows
        for (int row = 0; row < array.length; row++) {
            // loop through columns of current row
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%d ", array[row][column]);
            }
            System.out.println(); // start new line of output
            }
        }

    } // end class InitArray
