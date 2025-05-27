package chapter15.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("input.bin");
        FileOutputStream out = new FileOutputStream("output.bin");

        int byteData;
        while ((byteData = in.read()) != -1) {
            out.write(byteData);
        }

        in.close();
        out.close();
    }
}
