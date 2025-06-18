package chapter12.Examples;// Fig. 12.23: ListFrame.java
// JList that displays a list of colors.
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame {
    private final JList<String> colorJList; // list to display color names

    private static final String[] colorNames = {
        "Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
        "Magenta", "Orange", "Pink", "Red", "White", "Yellow"
    };

    private static final Color[] colors = {
        Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
        Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW
    };

    // ListFrame constructor adds JScrollPane containing JList to JFrame
    public ListFrame() {
        super("List Test");
        setLayout(new FlowLayout());

        // create a JList with colorNames
        colorJList = new JList<>(colorNames);
        colorJList.setVisibleRowCount(5); // show 5 items at once

        // disable multiple selections
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // add JList to a scroll pane and then add to the frame
        add(new JScrollPane(colorJList));

        // handle list selection events
        colorJList.addListSelectionListener(
            new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent event) {
                    getContentPane().setBackground(
                        colors[colorJList.getSelectedIndex()]);
                }
            }
        );
    }
}
