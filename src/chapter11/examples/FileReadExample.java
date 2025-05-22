package chapter11.examples;

import java.io.IOException;

public class FileReadExample {

    public static void readFile(String filename) throws IOException {
        if ("notfound.txt".equals(filename)) {
            throw new IOException("File not found: " + filename);
        }
        System.out.println("Reading from " + filename);
    }

    public static void readBackupFile() {
        System.out.println("Reading from backup file...");
    }

    public static void main(String[] args) {
        String filename = "notfound.txt"; // Try changing to "data.txt" to simulate no error

        try {
            readFile(filename);
        } catch (IOException e) {
            System.err.println("Exception caught: " + e.getMessage());
            readBackupFile();
        } finally {
            try {
                System.out.println("Closing file...");
                String resource = null;
                resource.toString(); // Simulates NullPointerException
            } catch (Exception e) {
                System.err.println("Exception during cleanup: " + e.getMessage());
            }
        }

        System.out.println("Program finished.");
    }
}
