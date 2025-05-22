package chapter11.examples;

// Funny example: Pizza Delivery Exception Handling

public class PizzaExceptionHandling {
    public static void main(String[] args) {
        try {
            orderPizza();
        } catch (Exception e) {
            System.err.println("🍕 Panic in main: " + e.getMessage());
        }

        orderWithoutTrouble();
    }

    // Simulates a pizza order that fails
    public static void orderPizza() throws Exception {
        try {
            System.out.println("🚚 Ordering pizza from Pizza Planet...");
            throw new Exception("Out of cheese! 😱");
        } catch (Exception e) {
            System.err.println("⚠️ Crisis in kitchen: " + e.getMessage());
            throw e; // rethrow to be handled by main
        } finally {
            System.err.println("🧹 Finally: Cleaning up the oven... 🍽️");
        }
    }

    // Simulates a pizza order that goes smoothly
    public static void orderWithoutTrouble() {
        try {
            System.out.println("🚚 Ordering pizza from CodeCrust...");
            System.out.println("🎉 Pizza arrived hot and cheesy!");
        } catch (Exception e) {
            System.err.println("🍕 Oops: " + e.getMessage());
        } finally {
            System.err.println("🧼 Finally: Recycling the pizza box... ♻️");
        }

        System.out.println("😋 End of peaceful pizza night.");
    }
}
