package chapter15.examples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        try (ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("clients.ser"))) {

            AccountRecord record = (AccountRecord) input.readObject(); // deserialize
            System.out.println(record.getFirstName() + " " + record.getLastName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
