package chapter15.examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {

        String fileName = "buffered_example.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello Honey Chauhan!");
            writer.newLine();
            writer.write("Welcome to Java Programming World");

            System.out.println("Data written successfully");

        } catch (IOException e){
            e.printStackTrace();

        }
    }
}
