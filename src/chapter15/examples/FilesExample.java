package chapter15.examples;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("data.txt");

        if (Files.exists(path)) {
            System.out.println("File exists.");
            Files.lines(path).forEach(System.out::println);
        } else {
            System.out.println("File does not exist.");
        }
    }
}
