package chapter16.exercises;
/*
16.15 (Color Chooser) Use a HashMap to create a reusable class for choosing one of the 13 predefined colors in class Color. The names of the colors should be used as keys, and the predefined
Color objects should be used as values. Place this class in a package that can be imported into any
Java program. Use your new class in an application that allows the user to select a color and draw a
shape in that color.
 */

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class ColorChooser {
    private static final Map<String, Color> colorMap = new HashMap<>();

    static {
        colorMap.put("Black", Color.BLACK);
        colorMap.put("Blue", Color.BLUE);
        colorMap.put("Cyan", Color.CYAN);
        colorMap.put("Dark Gray", Color.DARK_GRAY);
        colorMap.put("Gray", Color.GRAY);
        colorMap.put("Green", Color.GREEN);
        colorMap.put("Light Gray", Color.LIGHT_GRAY);
        colorMap.put("Magenta", Color.MAGENTA);
        colorMap.put("Orange", Color.ORANGE);
        colorMap.put("Pink", Color.PINK);
        colorMap.put("Red", Color.RED);
        colorMap.put("White", Color.WHITE);
        colorMap.put("Yellow", Color.YELLOW);
    }

    public static Color getColorByName(String name) {
        return colorMap.getOrDefault(name, Color.BLACK); // default to black
    }

    public static Map<String, Color> getColorMap() {
        return colorMap;
    }
}
