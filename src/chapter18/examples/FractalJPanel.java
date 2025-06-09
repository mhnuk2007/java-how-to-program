package chapter18.examples;// Fig. 18.19: FractalJPanel.java
// Drawing the "Lo feather fractal" using recursion.

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class FractalJPanel extends JPanel {
    private Color color; // stores color used to draw fractal
    private int level;   // stores current level of fractal

    private static final int WIDTH = 400;  // width of JPanel
    private static final int HEIGHT = 400; // height of JPanel

    // Constructor
    public FractalJPanel(int currentLevel) {
        color = Color.BLUE;            // initial drawing color
        level = currentLevel;          // initial fractal level
        setBackground(Color.WHITE);    // panel background
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    // Set new drawing color
    public void setColor(Color c) {
        color = c;
        repaint();
    }

    // Set new recursion level
    public void setLevel(int currentLevel) {
        level = currentLevel;
        repaint();
    }

    // Return current recursion level
    public int getLevel() {
        return level;
    }

    // Recursive method to draw the Lo feather fractal
    public void drawFractal(int level, int xA, int yA, int xB, int yB, Graphics g) {
        if (level == 0) {
            g.drawLine(xA, yA, xB, yB); // base case
        } else {
            // Midpoint between A and B
            int xC = (xA + xB) / 2;
            int yC = (yA + yB) / 2;

            // Calculate (xD, yD): forms isosceles right triangle
            int xD = xA + (xC - xA) / 2 - (yC - yA) / 2;
            int yD = yA + (yC - yA) / 2 + (xC - xA) / 2;

            // Recursively draw 3 segments
            drawFractal(level - 1, xD, yD, xA, yA, g);
            drawFractal(level - 1, xD, yD, xC, yC, g);
            drawFractal(level - 1, xD, yD, xB, yB, g);
        }
    }

    // paintComponent: called when panel is redrawn
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        drawFractal(level, 100, 90, 290, 200, g);
    }
}
