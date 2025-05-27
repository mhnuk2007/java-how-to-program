package chapter15.examples;

import java.nio.file.*;
import java.io.IOException;

public class DirectoryStreamExample {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("examples");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        }
    }
}
