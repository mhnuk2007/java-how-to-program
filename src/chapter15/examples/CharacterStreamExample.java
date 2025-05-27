package chapter15.examples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("input.txt");
        FileWriter writer = new FileWriter("output.txt");

        int charData;
        while ((charData = reader.read()) != -1) {
            writer.write(charData);
        }

        reader.close();
        writer.close();
    }
}
