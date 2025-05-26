package chapter15.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample2 {
    public static void main(String[] args) throws IOException {
        File file = new File("example2.txt");

        FileWriter writer = new FileWriter("example2.txt");

        writer.write("Hello Java");

        System.out.println("Text added successfully");

        writer.close();

    }
}
