package chapter18.examples;
// Fig. 18.18: Fractal.java
// Fractal user interface.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fractal extends JFrame {
    private static final int WIDTH = 400; // define width of GUI
    private static final int HEIGHT = 480; // define height of GUI
    private static final int MIN_LEVEL = 0;
    private static final int MAX_LEVEL = 15;

    // set up GUI
    public Fractal() {
        super("Fractal");

        // set up levelJLabel to add to controlJPanel
        final JLabel levelJLabel = new JLabel("Level: 0");

        // set up the drawing panel
        final FractalJPanel drawSpace = new FractalJPanel(0);

        // set up control panel
        final JPanel controlJPanel = new JPanel();
        controlJPanel.setLayout(new FlowLayout());

        // set up color button and register listener
        final JButton changeColorJButton = new JButton("Color");
        controlJPanel.add(changeColorJButton);
        changeColorJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        Color color = JColorChooser.showDialog(
                                Fractal.this, "Choose a color", Color.BLUE
                        );

                        // set default color, if no color is returned
                        if (color == null)
                            color = Color.BLUE;

                        drawSpace.setColor(color);
                    }
                }
        );

        // set up decrease level button and register listener
        final JButton decreaseLevelJButton = new JButton("Decrease Level");
        controlJPanel.add(decreaseLevelJButton);
        decreaseLevelJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        int level = drawSpace.getLevel();
                        --level;

                        if (level >= MIN_LEVEL && level <= MAX_LEVEL) {
                            levelJLabel.setText("Level: " + level);
                            drawSpace.setLevel(level);
                            repaint();
                        }
                    }
                }
        );

        // set up increase level button and register listener
        final JButton increaseLevelJButton = new JButton("Increase Level");
        controlJPanel.add(increaseLevelJButton);
        increaseLevelJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        int level = drawSpace.getLevel();
                        ++level;

                        if (level >= MIN_LEVEL && level <= MAX_LEVEL) {
                            levelJLabel.setText("Level: " + level);
                            drawSpace.setLevel(level);
                            repaint();
                        }
                    }
                }
        );

        // add level label to control panel
        controlJPanel.add(levelJLabel);

        // create main panel to contain controls and drawing space
        final JPanel mainJPanel = new JPanel();
        mainJPanel.setLayout(new BorderLayout());
        mainJPanel.add(controlJPanel, BorderLayout.NORTH);
        mainJPanel.add(drawSpace, BorderLayout.CENTER);

        add(mainJPanel); // add everything to the frame

        setSize(WIDTH, HEIGHT); // set size of JFrame
        setVisible(true); // display JFrame
    }

    public static void main(String[] args) {
        Fractal demo = new Fractal();
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
