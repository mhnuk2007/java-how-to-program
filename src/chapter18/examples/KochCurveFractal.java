package chapter18.examples;
// KochCurveFractal.java
// This program recursively draws the Koch Curve fractal using Java Swing.
// At each level of recursion, it replaces each line segment with four new segments
// forming a triangular "spike" in the middle third, creating a self-similar snowflake pattern.


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class KochCurveFractal extends JPanel {

    // Draw Koch Curve recursively
    private void drawKoch(Graphics2D g, int level, double x1, double y1, double x5, double y5) {
        if (level == 0) {
            g.draw(new Line2D.Double(x1, y1, x5, y5));
        } else {
            double deltaX = (x5 - x1) / 3;
            double deltaY = (y5 - y1) / 3;

            // Points dividing the segment
            double x2 = x1 + deltaX;
            double y2 = y1 + deltaY;

            double x3 = (x1 + x5) / 2 - Math.sqrt(3) * (y1 - y5) / 6;
            double y3 = (y1 + y5) / 2 - Math.sqrt(3) * (x5 - x1) / 6;

            double x4 = x1 + 2 * deltaX;
            double y4 = y1 + 2 * deltaY;

            // Recurse for 4 segments
            drawKoch(g, level - 1, x1, y1, x2, y2);
            drawKoch(g, level - 1, x2, y2, x3, y3);
            drawKoch(g, level - 1, x3, y3, x4, y4);
            drawKoch(g, level - 1, x4, y4, x5, y5);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.white);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.blue);
        g2.setStroke(new BasicStroke(1));

        // Starting and ending points
        drawKoch(g2, 4, 50, 300, 450, 300); // depth 4, adjust as needed
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Koch Curve Fractal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.add(new KochCurveFractal());
        frame.setVisible(true);
    }
}
