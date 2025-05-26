package chapter15.examples;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "buffered_example.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))) {
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
