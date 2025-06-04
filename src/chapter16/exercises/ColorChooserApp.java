package chapter16.exercises;
/*
16.15 (Color Chooser) Use a HashMap to create a reusable class for choosing one of the 13 predefined colors in class Color. The names of the colors should be used as keys, and the predefined
Color objects should be used as values. Place this class in a package that can be imported into any
Java program. Use your new class in an application that allows the user to select a color and draw a
shape in that color.
 */



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class ColorChooserApp extends JFrame {
    private final JPanel drawPanel;
    private final JComboBox<String> colorComboBox;

    public ColorChooserApp() {
        super("Color Chooser Example");

        // Create GUI components
        drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(ColorChooser.getColorByName((String) colorComboBox.getSelectedItem()));
                g.fillOval(50, 50, 100, 100); // Draw a circle
            }
        };

        drawPanel.setPreferredSize(new Dimension(200, 200));

        Set<String> colorNames = ColorChooser.getColorMap().keySet();
        colorComboBox = new JComboBox<>(colorNames.toArray(new String[0]));

        colorComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawPanel.repaint();
            }
        });

        // Layout
        setLayout(new BorderLayout());
        add(colorComboBox, BorderLayout.NORTH);
        add(drawPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColorChooserApp::new);
    }
}
