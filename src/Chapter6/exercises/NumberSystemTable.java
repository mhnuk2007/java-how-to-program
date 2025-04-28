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
                    decimalToBinary(decimal),
                    decimalToOctal(decimal),
                    decimalToHexadecimal(decimal)
            );
        }
    }

    // Manual method to convert decimal to binary using StringBuilder
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }

        return binary.toString();
    }

    // Manual method to convert decimal to octal using StringBuilder
    public static String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder octal = new StringBuilder();

        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal /= 8;
        }

        return octal.toString();
    }

    // Manual method to convert decimal to hexadecimal using StringBuilder
    public static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder hexadecimal = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hexadecimal.insert(0, remainder);
            } else {
                hexadecimal.insert(0, (char)(remainder - 10 + 'A'));
            }
            decimal /= 16;
        }

        return hexadecimal.toString();
    }
}
