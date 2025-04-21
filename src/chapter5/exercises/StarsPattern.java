package chapter5.exercises;

/*
    5.15 (Triangle Printing Program)
    Triangle pattern generator using nested for-loops.
*/

public class StarsPattern {
    public static void main(String[] args) {
        int rows = 10;

        // Pattern (a) Lower Left
        System.out.println("(a) Lower Left");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern (b) Upper Left
        System.out.println("\n(b) Upper Left");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern (c) Upper Right
        System.out.println("\n(c) Upper Right");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern (d) Lower Right
        System.out.println("\n(d) Lower Right");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
