package chapter5.exercises;

public class ModifiedAutoPolicyTest {
    public static void main(String[] args) {
        // Create AutoPolicy objects with valid and invalid state codes
        ModifiedAutoPolicy policy1 = new ModifiedAutoPolicy(11111111, "Toyota Camry", "NJ");
        ModifiedAutoPolicy policy2 = new ModifiedAutoPolicy(22222222, "Ford Fusion", "ME");
        ModifiedAutoPolicy policy3 = new ModifiedAutoPolicy(33333333, "Honda Civic", "TX"); // Invalid

        // Display whether each policy is in a no-fault state
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
        policyInNoFaultState(policy3);
    }

    // Method that displays whether an AutoPolicy is in a state with no-fault auto insurance
    public static void policyInNoFaultState(ModifiedAutoPolicy policy) {
        if (policy.getState() != null) {
            System.out.println("The auto policy:");
            System.out.printf(
                    "Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
                    policy.getAccountNumber(), policy.getMakeAndModel(),
                    policy.getState(),
                    (policy.isNoFaultState() ? "is" : "is not"));
        } else {
            System.out.println("Policy creation failed due to invalid state.\n");
        }
    }
}
