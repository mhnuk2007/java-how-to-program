package chapter16.examples;

import java.io.*;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties props = new Properties();

        // Load properties from a file
        try (InputStream input = new FileInputStream("config.properties")) {
            props.load(input);
            System.out.println("Properties loaded from file.");
        } catch (IOException e) {
            System.out.println("Could not load properties file: " + e.getMessage());
        }

        // Access a property
        String username = props.getProperty("username");
        System.out.println("Username: " + username);

        // Modify or add a property
        props.setProperty("timeout", "30");

        // Store properties back to a file
        try (OutputStream output = new FileOutputStream("config.properties")) {
            props.store(output, "Updated configuration");
            System.out.println("Properties saved to file.");
        } catch (IOException e) {
            System.out.println("Could not save properties file: " + e.getMessage());
        }

        // List all properties to console
        System.out.println("Listing all properties:");
        props.list(System.out);
    }
}
