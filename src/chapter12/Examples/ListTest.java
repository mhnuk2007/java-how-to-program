package chapter12.Examples;// Fig. 12.24: ListTest.java
// Testing ListFrame.
import javax.swing.JFrame;

public class ListTest {
    public static void main(String[] args) {
        ListFrame listFrame = new ListFrame(); // create frame
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listFrame.setSize(350, 150);
        listFrame.setVisible(true);
    }
}
