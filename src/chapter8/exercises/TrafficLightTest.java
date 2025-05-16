package chapter8.exercises;
/*
Exercise: 8.10 Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) take one parameter—the duration of the light. Write a program to test the TrafficLight enum so that it displays the
enum constants and their durations.
 */

public class TrafficLightTest {
    public static void main(String[] args) {
        System.out.println("Traffic Light Durations:");

        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s: %d seconds%n", light, light.getDuration());
        }
    }
}

// Enum inside the same file (not public)
enum TrafficLight {
    RED(30),
    GREEN(45),
    YELLOW(5);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
