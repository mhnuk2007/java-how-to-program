package chapter15.examples;

import java.io.File;
import java.io.FileReader;

public class ReadFileExample2 {
    public static void main(String[] args) throws Exception {
        File file = new File("example2.txt");
        if (file.exists()) {
            FileReader reader = new FileReader(file);
            System.out.println(reader.read());
            reader.close();
        }
    }
}
