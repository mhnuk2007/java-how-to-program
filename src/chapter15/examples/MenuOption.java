package chapter15.examples;
// Fig. 15.7: MenuOption.java
// enum type for the credit-inquiry program's options.

public enum MenuOption {
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);

    private final int value;

    // Constructor
    private MenuOption(int value) {
        this.value = value;
    }
}
