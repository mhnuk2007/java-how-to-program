package chapter15.exercises;
/*
Exercise: 15.4 (File Matching)
This problem focuses on building a file-matching program, commonly used in real-world accounts
receivable systems. It involves reading a master file (oldmast.txt) and a transaction
file (trans.txt) to update account balances, then writing the results to a new master
file (newmast.txt). Unmatched records should be logged.

Part c) Create data for testing
Purpose: Simulate real-world testing by generating two input files:
oldmast.txt: Master account records (from Fig. 15.14).
trans.txt: List of transactions (from Fig. 15.15).
Task: Write a small program to generate these files for use in the file-matching logic.


 */

import java.io.IOException;
import java.util.Formatter;

public class CreateData {
    public static void main(String[] args) {
        try (
                Formatter masterOut = new Formatter("oldMast.txt");
                Formatter transOut = new Formatter("trans.txt")
        ) {
            // Create master file
            masterOut.format("%d %s %s %.2f%n", 100, "Sunny", "Chauhan", 1230.50);
            masterOut.format("%d %s %s %.2f%n", 200, "Honey", "Chauhan", 735.37);
            masterOut.format("%d %s %s %.2f%n", 300, "Hitesh", "Chauhan", 815.23);
            masterOut.format("%d %s %s %.2f%n", 400, "Sandeep", "Chauhan", 599.99);

            // Create transaction file
            transOut.format("%d %.2f%n", 100, 33.15);
            transOut.format("%d %.2f%n", 200, 25.15);
            transOut.format("%d %.2f%n", 300, 44.53);
            transOut.format("%d %.2f%n", 400, 85.12);

            System.out.println("Files created successfully.");

        } catch (IOException e) {
            System.err.println("Error writing files:" + e.getMessage());
        }
    }
}
