package chapter15.examples;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class PersistentExample {
    public static void main(String[] args) throws IOException {
        // Writing persistent data
        FileWriter writer = new FileWriter("data.txt");
        writer.write("User Score: 1500");
        writer.close();

        // Reading persistent data
        FileReader reader = new FileReader("data.txt");
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
    }
}
