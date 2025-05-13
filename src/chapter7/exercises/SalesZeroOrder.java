package chapter7.exercises;
/*
Exercise:7.13 Label the elements of three-by-five two-dimensional array sales to indicate the order in
which they’re set to zero by the following program segment:
for (int row = 0; row < sales.length; row++)
{
 for (int col = 0; col < sales[row].length; col++)
 {
 sales[row][col] = 0;
 }
}
 */

public class SalesZeroOrder {
    public static void main(String[] args) {
        int[][] sales = new int[3][5];

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = 0;
                System.out.printf("Setting sales[%d][%d] to 0%n", row, col);
            }
        }

        // Optional: Display the final array
        System.out.println("\nFinal sales array:");
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                System.out.print(sales[row][col] + " ");
            }
            System.out.println();
        }
    }
}