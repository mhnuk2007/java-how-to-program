package chapter15.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFileExample2 {
    public static void main(String[] args) throws IOException {
        File file = new File("example2.txt");

        FileWriter writer = new FileWriter("example2.txt", true);

        writer.append(" World");

        System.out.println("Text added successfully");

        writer.close();

    }
}
