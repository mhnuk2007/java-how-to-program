// PieceWorker.java
package chapter10.exercises;
/*
Exercise: 10.14 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include an
additional Employee subclass PieceWorker that represents an employee whose pay is based on the
number of pieces of merchandise produced. Class PieceWorker should contain private instance
variables wage (to store the employee’s wage per piece) and pieces (to store the number of pieces
produced). Provide a concrete implementation of method earnings in class PieceWorker that calculates the employee’s earnings by multiplying the number of pieces produced by the wage per
piece. Create an array of Employee variables to store references to objects of each concrete class in
the new Employee hierarchy. For each Employee, display its String representation and earnings.
 */

public class PieceWorker extends Employee {
    private double wage;   // wage per piece
    private int pieces;    // number of pieces produced

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (wage < 0.0) throw new IllegalArgumentException("Wage per piece must be >= 0.0");
        if (pieces < 0) throw new IllegalArgumentException("Number of pieces must be >= 0");
        this.wage = wage;
        this.pieces = pieces;
    }

    public void setWage(double wage) {
        if (wage < 0.0) throw new IllegalArgumentException("Wage per piece must be >= 0.0");
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setPieces(int pieces) {
        if (pieces < 0) throw new IllegalArgumentException("Number of pieces must be >= 0");
        this.pieces = pieces;
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public double earnings() {
        return getWage() * getPieces();
    }

    @Override
    public String toString() {
        return String.format("piece worker: %s%nwage per piece: $%.2f; pieces produced: %d",
                super.toString(), getWage(), getPieces());
    }
}
