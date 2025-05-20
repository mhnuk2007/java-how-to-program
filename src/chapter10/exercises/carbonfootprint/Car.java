package chapter10.exercises.carbonfootprint;

public class Car implements CarbonFootprint {
    private double milesPerYear;
    private double mpg;

    public Car(double milesPerYear, double mpg) {
        this.milesPerYear = milesPerYear;
        this.mpg = mpg;
    }

    @Override
    public double getCarbonFootprint() {
        double gallonsUsedPerYear = milesPerYear / mpg;
        double carbonPerGallon = 8.89; // kg CO2 per gallon
        return gallonsUsedPerYear * carbonPerGallon;
    }

    @Override
    public String toString() {
        return String.format("Car [%.0f miles/year, %.1f mpg]", milesPerYear, mpg);
    }
}
