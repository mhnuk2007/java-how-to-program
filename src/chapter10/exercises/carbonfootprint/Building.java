package chapter10.exercises.carbonfootprint;

public class Building implements CarbonFootprint {
    private double squareFeet;
    private double electricityUsagePerMonth; // in kWh

    public Building(double squareFeet, double electricityUsagePerMonth) {
        this.squareFeet = squareFeet;
        this.electricityUsagePerMonth = electricityUsagePerMonth;
    }

    @Override
    public double getCarbonFootprint() {
        double annualElectricityUsage = electricityUsagePerMonth * 12;
        double carbonPerKWh = 0.417; // kg CO2 per kWh
        return annualElectricityUsage * carbonPerKWh;
    }

    @Override
    public String toString() {
        return String.format("Building [%.0f sq ft, %.1f kWh/month]", squareFeet, electricityUsagePerMonth);
    }
}
