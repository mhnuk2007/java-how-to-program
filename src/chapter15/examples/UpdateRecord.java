package chapter15.examples;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UpdateRecord {
    public static void main(String[] args) {
        String oldRecord = "old record";
        String newRecord = "updated record";

        File file = new File("crud.txt");
        List<String> lines = new ArrayList<>();

        // Read all lines
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(oldRecord)) {
                    lines.add(newRecord);  // update record
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write all lines back to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            System.out.println("Record updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
