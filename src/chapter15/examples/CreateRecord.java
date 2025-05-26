package chapter15.examples;

import java.io.FileWriter;
import java.io.IOException;

public class CreateRecord {
    public static void main(String[] args) {
        String record = "New record data";

        try (FileWriter writer = new FileWriter("crud.txt", true)) { // true = append mode
            writer.write(record + System.lineSeparator());
            System.out.println("Record added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
