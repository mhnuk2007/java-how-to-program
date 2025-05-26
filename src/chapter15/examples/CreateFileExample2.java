package chapter15.examples;

import java.io.File;
import java.io.IOException;

public class CreateFileExample2 {
    public static void main(String[] args) throws IOException {
        File file = new File("example2.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }


    }
}
