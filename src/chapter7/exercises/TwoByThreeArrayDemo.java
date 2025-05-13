package chapter7.exercises;
/*
Exercise 7.9
Consider a two-by-three integer array t.
a) Write a statement that declares and creates t.
b) How many rows does t have?
c) How many columns does t have?
d) How many elements does t have?
e) Write access expressions for all the elements in row 1 of t.
f) Write access expressions for all the elements in column 2 of t.
g) Write a single statement that sets the element of t in row 0 and column 1 to zero.
h) Write individual statements to initialize each element of t to zero.
i) Write a nested for statement that initializes each element of t to zero.
j) Write a nested for statement that inputs the values for the elements of t from the user.
k) Write a series of statements that determines and displays the smallest value in t.
l) Write a single printf statement that displays the elements of the first row of t.
m) Write a statement that totals the elements of the third column of t. Do not use repetition.
n) Write a series of statements that displays the contents of t in tabular format. List the
column indices as headings across the top, and list the row indices at the left of each row.
 */

import java.util.Scanner;

public class TwoByThreeArrayDemo {
    public static void main(String[] args) {
        // a) Declare and create the array t
        int[][] t = new int[2][3];

        // b) Number of rows
        System.out.println("b) Number of rows: " + t.length);

        // c) Number of columns
        System.out.println("c) Number of columns: " + t[0].length);

        // d) Number of elements
        System.out.println("d) Total elements: " + (t.length * t[0].length));

        // e) Access expressions for row 1
        System.out.println("e) Row 1 elements: t[1][0], t[1][1], t[1][2]");

        // f) Access expressions for column 2
        System.out.println("f) Column 2 elements: t[0][1], t[1][1]");

        // g) Set element at row 0 and column 1 to zero
        t[0][1] = 0;

        // h) Initialize each element to zero individually
        t[0][0] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

        // i) Initialize each element using nested for loop
        for (int row = 0; row < t.length; row++) {
            for (int col = 0; col < t[row].length; col++) {
                t[row][col] = 0;
            }
        }

        // j) Input values from the user
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < t.length; row++) {
            for (int col = 0; col < t[row].length; col++) {
                System.out.printf("Enter value for t[%d][%d]: ", row, col);
                t[row][col] = input.nextInt();
            }
        }

        // k) Determine and display the smallest value in t
        int smallest = t[0][0];
        for (int row = 0; row < t.length; row++) {
            for (int col = 0; col < t[row].length; col++) {
                if (t[row][col] < smallest) {
                    smallest = t[row][col];
                }
            }
        }
        System.out.println("k) Smallest value in t: " + smallest);

        // l) Print the first row of t
        System.out.printf("l) First row: %d %d %d%n", t[0][0], t[0][1], t[0][2]);

        // m) Total of the third column (index 2)
        int totalCol3 = t[0][2] + t[1][2];
        System.out.println("m) Total of column 2: " + totalCol3);

        // n) Tabular display
        System.out.println("n) Tabular display:");
        System.out.print("       ");
        for (int col = 0; col < t[0].length; col++) {
            System.out.printf("Col %d ", col);
        }
        System.out.println();
        for (int row = 0; row < t.length; row++) {
            System.out.printf("Row %d ", row);
            for (int col = 0; col < t[row].length; col++) {
                System.out.printf("  %3d ", t[row][col]);
            }
            System.out.println();
        }
    }
}
