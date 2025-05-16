package chapter8.exercises;

public class HugeInteger {
    private static final int SIZE = 40;
    private int[] digits = new int[SIZE];

    // Default constructor - initializes to zero
    public HugeInteger() {
        for (int i = 0; i < SIZE; i++) {
            digits[i] = 0;
        }
    }

    // Parse method - receives string and stores digits
    public void parse(String number) {
        if (number.length() > SIZE) {
            throw new IllegalArgumentException("Number too large, max 40 digits");
        }

        // Clear digits
        for (int i = 0; i < SIZE; i++) {
            digits[i] = 0;
        }

        int len = number.length();
        for (int i = 0; i < len; i++) {
            char c = number.charAt(len - 1 - i); // Right to left
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Invalid character in number");
            }
            digits[i] = c - '0';
        }
    }

    // toString method - converts digits back to string
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (int i = SIZE - 1; i >= 0; i--) {
            if (digits[i] != 0) leadingZero = false;
            if (!leadingZero) sb.append(digits[i]);
        }
        return leadingZero ? "0" : sb.toString();
    }

    // Add two HugeIntegers and return a new HugeInteger
    public HugeInteger add(HugeInteger other) {
        HugeInteger result = new HugeInteger();
        int carry = 0;

        for (int i = 0; i < SIZE; i++) {
            int sum = this.digits[i] + other.digits[i] + carry;
            result.digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry != 0) {
            throw new ArithmeticException("Overflow: Result exceeds 40 digits");
        }

        return result;
    }

    // Subtract other from this HugeInteger, assumes this >= other, else throws
    public HugeInteger subtract(HugeInteger other) {
        if (this.isLessThan(other)) {
            throw new ArithmeticException("Subtraction would result in negative number");
        }

        HugeInteger result = new HugeInteger();
        int borrow = 0;

        for (int i = 0; i < SIZE; i++) {
            int diff = this.digits[i] - other.digits[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits[i] = diff;
        }

        return result;
    }

    // Comparison predicates

    public boolean isEqualTo(HugeInteger other) {
        for (int i = 0; i < SIZE; i++) {
            if (this.digits[i] != other.digits[i]) return false;
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger other) {
        return !isEqualTo(other);
    }

    public boolean isGreaterThan(HugeInteger other) {
        for (int i = SIZE - 1; i >= 0; i--) {
            if (this.digits[i] > other.digits[i]) return true;
            else if (this.digits[i] < other.digits[i]) return false;
        }
        return false; // equal
    }

    public boolean isLessThan(HugeInteger other) {
        for (int i = SIZE - 1; i >= 0; i--) {
            if (this.digits[i] < other.digits[i]) return true;
            else if (this.digits[i] > other.digits[i]) return false;
        }
        return false; // equal
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger other) {
        return isGreaterThan(other) || isEqualTo(other);
    }

    public boolean isLessThanOrEqualTo(HugeInteger other) {
        return isLessThan(other) || isEqualTo(other);
    }

    public boolean isZero() {
        for (int d : digits) {
            if (d != 0) return false;
        }
        return true;
    }

    // Test main method
    public static void main(String[] args) {
        HugeInteger num1 = new HugeInteger();
        HugeInteger num2 = new HugeInteger();

        num1.parse("1234567890123456789012345678901234567890");
        num2.parse("987654321098765432109876543210987654321");

        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

        HugeInteger sum = num1.add(num2);
        System.out.println("Sum: " + sum);

        HugeInteger diff = num1.subtract(num2);
        System.out.println("Difference: " + diff);

        System.out.printf("num1 == num2? %b%n", num1.isEqualTo(num2));
        System.out.printf("num1 != num2? %b%n", num1.isNotEqualTo(num2));
        System.out.printf("num1 > num2? %b%n", num1.isGreaterThan(num2));
        System.out.printf("num1 < num2? %b%n", num1.isLessThan(num2));
        System.out.printf("num1 >= num2? %b%n", num1.isGreaterThanOrEqualTo(num2));
        System.out.printf("num1 <= num2? %b%n", num1.isLessThanOrEqualTo(num2));
        System.out.printf("num1 is zero? %b%n", num1.isZero());
    }
}
