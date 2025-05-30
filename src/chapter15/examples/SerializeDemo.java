package chapter15.examples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("clients.ser"))) {

            AccountRecord record = new AccountRecord(100, "Bob", "Blue", 24.98);
            output.writeObject(record); // serialize the object

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
