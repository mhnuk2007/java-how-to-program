package chapter10.exercises.shapehierarchy;

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public String getName() {
        return "Sphere";
    }

    public String toString() {
        return String.format("%s [radius=%.2f, area=%.2f, volume=%.2f]", getName(), radius, getArea(), getVolume());
    }
}
