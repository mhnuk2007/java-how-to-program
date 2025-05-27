package chapter15.examples;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class URIPathExample {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("file:///C:/Users/data.txt");
        Path path = Paths.get(uri);
        System.out.println("Path from URI: " + path);
    }
}
