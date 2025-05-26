package chapter15.examples;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFileExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("example.txt", true)) {
            writer.write("\nAppended line.");
            System.out.println("Data appended.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
