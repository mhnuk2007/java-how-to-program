package chapter10.exercises.carbonfootprint;

public class Bicycle implements CarbonFootprint {
    private int distancePerWeek; // km

    public Bicycle(int distancePerWeek) {
        this.distancePerWeek = distancePerWeek;
    }

    @Override
    public double getCarbonFootprint() {
        // Bicycles produce negligible CO2, consider manufacture & maintenance (~21g/km)
        double annualDistanceKm = distancePerWeek * 52;
        return annualDistanceKm * 0.021; // kg CO2
    }

    @Override
    public String toString() {
        return String.format("Bicycle [%d km/week]", distancePerWeek);
    }
}
