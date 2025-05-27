package chapter15.examples;// Fig. 15.6: ReadTextFile.java
// This program reads a text file and displays each record.

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {

    private static Scanner input; // Scanner for reading from the file

    public static void main(String[] args) {
        openFile();     // Open the file
        readRecords();  // Read and display file records
        closeFile();    // Close the file
    }

    // open file clients.txt
    public static void openFile() {
        try {
            // Scanner reads from the path of the file
            input = new Scanner(Paths.get("clients.txt"));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
    }

    // read records from the file
    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", 
            "Account", "First Name", "Last Name", "Balance");

        try {
            // read records until end-of-file
            while (input.hasNext()) {
                // read and display each record
                System.out.printf("%-10d%-12s%-12s%10.2f%n",
                    input.nextInt(),    // account number
                    input.next(),       // first name
                    input.next(),       // last name
                    input.nextDouble()  // balance
                );
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        }
    }

    // close the file
    public static void closeFile() {
        if (input != null) {
            input.close(); // release resources
        }
    }
}
