package chapter15.examples;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeleteRecord {
    public static void main(String[] args) {
        String recordToDelete = "record to delete";

        File file = new File("crud.txt");
        List<String> lines = new ArrayList<>();

        // Read all lines except the one to delete
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.equals(recordToDelete)) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write remaining lines back to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            System.out.println("Record deleted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
