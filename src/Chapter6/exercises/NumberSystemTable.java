package Chapter6.exercises;

/*
     6.34 (Table of Binary, Octal and Hexadecimal Numbers) Write an application that
     displays a table of the binary, octal and hexadecimal equivalents of the decimal
     numbers in the range 1 through 256. If you aren’t familiar with these number systems,
     read online Appendix J first.
 */

public class NumberSystemTable {
    public static void main(String[] args) {
        // Print table header
        System.out.printf("%-10s%-15s%-15s%-15s%n", "Decimal", "Binary", "Octal", "Hexadecimal");
        System.out.println("-------------------------------------------------------------");

        // Loop through decimal numbers from 1 to 256
        for (int decimal = 1; decimal <= 256; decimal++) {
            System.out.printf("%-10d%-15s%-15s%-15s%n",
                    decimal,
                    Integer.toBinaryString(decimal),
                    Integer.toOctalString(decimal),
                    Integer.toHexString(decimal).toUpperCase()
            );
        }
    }
}
