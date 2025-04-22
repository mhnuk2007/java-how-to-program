package chapter5.exercises;
/*
    5.30 (Modified AutoPolicy Class) Modify class AutoPolicy in Fig. 5.11 to validate the two-letter
state codes for the northeast states. The codes are: CT for Connecticut, MA for Massachusetts, ME
for Maine, NH for New Hampshire, NJ for New Jersey, NY for New York, PA for Pennsylvania
and VT for Vermont. In AutoPolicy method setState, use the logical OR (||) operator
(Section 5.9) to create a compound condition in an if…else statement that compares the method’s
argument with each two-letter code. If the code is incorrect, the else part of the if…else statement
should display an error message. In later chapters, you’ll learn how to use exception handling to indicate that a method received an invalid value.
 */

public class ModifiedAutoPolicy {
    private int accountNumber; // policy account number
    private String makeAndModel; // car that the policy applies to
    private String state; // two-letter state abbreviation

    // constructor
    public ModifiedAutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        setState(state); // validate and set the state
    }

    // sets the accountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // returns the accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // sets the makeAndModel
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    // returns the makeAndModel
    public String getMakeAndModel() {
        return makeAndModel;
    }

    // sets the state with validation for northeast states
    public void setState(String state) {
        if (state.equals("CT") || state.equals("MA") || state.equals("ME") ||
                state.equals("NH") || state.equals("NJ") || state.equals("NY") ||
                state.equals("PA") || state.equals("VT")) {
            this.state = state;
        } else {
            System.out.printf("Error: Invalid state code \"%s\". Must be a valid northeast state.%n", state);
        }
    }

    // returns the state
    public String getState() {
        return state;
    }

    // predicate method returns whether the state has no-fault insurance
    public boolean isNoFaultState() {
        boolean noFaultState;

        // determine whether state has no-fault auto insurance
        switch (getState()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }
} // end class AutoPolicy
