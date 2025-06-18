package chapter12.Examples;
// Fig. 12.15: ButtonFrame.java
// Command buttons and action events.

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {

    private final JButton plainButton;  // button with just text
    private final JButton fancyButton; // button with icons

    // ButtonFrame adds JButtons to JFrame
    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainButton = new JButton("Plain Button"); // button with just text
        add(plainButton); // add plainButton to JFrame

        Icon bug1 = new ImageIcon(getClass().getResource("bug1.png"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.png"));
        fancyButton = new JButton("Fancy Button", bug1); // set image
        fancyButton.setRolloverIcon(bug2); // set rollover image
        add(fancyButton); // add fancyButton to JFrame

        // create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        plainButton.addActionListener(handler);
        fancyButton.addActionListener(handler);
    }

    // private inner class for handling button events
    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
                    "You pressed: %s", event.getActionCommand()));
        }
    }
} // end class ButtonFrame

