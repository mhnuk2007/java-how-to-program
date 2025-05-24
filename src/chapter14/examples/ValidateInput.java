package chapter14.examples;// Fig. 14.20: ValidateInput.java
// Validate user information using regular expressions.

public class ValidateInput {

    // validate first name
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    // validate last name
    public static boolean validateLastName(String lastName) {
        return lastName.matches("[A-Z][a-zA-Z]*");
    }

    // validate address (must start with number, then space, then words)
    public static boolean validateAddress(String address) {
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // validate city
    public static boolean validateCity(String city) {
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // validate state (must be exactly two uppercase letters)
    public static boolean validateState(String state) {
        return state.matches("([A-Z]{2})");
    }

    // validate ZIP code (must be 5 digits)
    public static boolean validateZip(String zip) {
        return zip.matches("\\d{5}");
    }

    // validate phone number (format: (123) 456-7890)
    public static boolean validatePhone(String phone) {
        return phone.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
    }
}
