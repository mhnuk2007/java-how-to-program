package chapter12.Examples;// Fig. 12.25: MultipleSelectionFrame.java
// JList that allows multiple selections.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {
    private final JList<String> colorJList;  // list to hold color names
    private final JList<String> copyJList;   // list to hold copied names
    private final JButton copyJButton;       // button to copy selected names

    private static final String[] colorNames = {
        "Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
        "Magenta", "Orange", "Pink", "Red", "White", "Yellow"
    };

    // MultipleSelectionFrame constructor
    public MultipleSelectionFrame() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        // list of color names with multiple-selection enabled
        colorJList = new JList<>(colorNames);
        colorJList.setVisibleRowCount(5);
        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList)); // add scrollable list

        // copy button with action listener
        copyJButton = new JButton("Copy >>>");
        copyJButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    // copy selected values to copyJList
                    copyJList.setListData(
                        colorJList.getSelectedValuesList().toArray(new String[0])
                    );
                }
            }
        );
        add(copyJButton); // add button

        // create list for copied items
        copyJList = new JList<>();
        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellWidth(100);    // set fixed width
        copyJList.setFixedCellHeight(15);    // set fixed height
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList)); // add scrollable copy list
    }
}
