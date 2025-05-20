package chapter10.exercises.carbonfootprint;

import java.util.ArrayList;

public class CarbonFootprintTest {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> items = new ArrayList<>();

        items.add(new Building(2000, 1000));         // 2000 sq ft, 1000 kWh/month
        items.add(new Car(12000, 25));               // 12000 miles/year, 25 mpg
        items.add(new Bicycle(50));                  // 50 km/week

        for (CarbonFootprint item : items) {
            System.out.printf("%s has annual carbon footprint: %.2f kg CO2%n",
                    item.toString(), item.getCarbonFootprint());
        }
    }
}
