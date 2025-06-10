package chapter18.exercises;
/*
Exercise 18.19: (Fractals) Repeat the fractal pattern in Section 18.9 to form a star.
Begin with five lines (see Fig. 18.21) instead of one, where each line is a different arm
of the star. Apply the “Lo feather fractal” pattern to each arm of the star.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class StarFractal extends JPanel {

    private static final int ARM_LENGTH = 100;
    private static final int RECURSION_DEPTH = 4;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Move origin to center of panel
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        g2.translate(centerX, centerY);

        // Draw 5 arms separated by 72 degrees
        for (int i = 0; i < 5; i++) {
            // Save original transform
            AffineTransform original = g2.getTransform();

            // Rotate to the correct arm angle
            g2.rotate(Math.toRadians(i * 72));

            // Draw fractal arm
            drawLoFeather(g2, ARM_LENGTH, RECURSION_DEPTH);

            // Restore transform
            g2.setTransform(original);
        }
    }

    // Recursive method to draw Lo feather fractal pattern
    private void drawLoFeather(Graphics2D g2, double length, int depth) {
        if (depth == 0) {
            // Base case: draw a simple line forward
            g2.drawLine(0, 0, (int) length, 0);
            g2.translate(length, 0);
        } else {
            // Recursive case: draw line and branch recursively
            length /= 3;

            // Draw first segment
            drawLoFeather(g2, length, depth - 1);

            // Branch up (rotate by 45 degrees)
            g2.rotate(Math.toRadians(45));
            drawLoFeather(g2, length, depth - 1);

            // Branch down (rotate back by 90 degrees)
            g2.rotate(Math.toRadians(-90));
            drawLoFeather(g2, length, depth - 1);

            // Restore rotation
            g2.rotate(Math.toRadians(45));

            // Draw last segment
            drawLoFeather(g2, length, depth - 1);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Star Fractal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        StarFractal panel = new StarFractal();
        frame.add(panel);
        frame.setVisible(true);
    }
}
