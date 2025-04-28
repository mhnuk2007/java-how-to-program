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
            System.out.printf("%-10d%-15s%-15s%-15s%n", decimal, decimalToBinary(decimal), decimalToOctal(decimal), decimalToHexadecimal(decimal));
        }


    }

    // Manual method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        return binary;
    }

    // Manual method to convert decimal to octal
    public static String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        String octal = "";

        while (decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal /= 8;
        }
        return octal;
    }


    // Manual method to convert decimal to Hexadecimal
    public static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        String hexadecimal = "";
        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hexadecimal = remainder + hexadecimal;
            } else {
                hexadecimal = (char) (remainder - 10 + 'A') + hexadecimal;
            }
            decimal /= 16;

        }
        return hexadecimal;
    }
}

