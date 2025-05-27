package chapter15.examples;

import java.nio.file.*;
import java.io.IOException;

public class NIOReadExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("example.txt");
        byte[] bytes = Files.readAllBytes(path);
        String content = new String(bytes);
        System.out.println(content);
    }
}
