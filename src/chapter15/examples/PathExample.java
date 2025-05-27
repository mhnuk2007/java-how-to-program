package chapter15.examples;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get("examples/file.txt");
        System.out.println("File Name: " + path.getFileName());
        System.out.println("Absolute Path: " + path.toAbsolutePath());
    }
}
