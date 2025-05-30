package chapter15.exercises;
/*
Exercise: 15.4 (File Matching)
This problem focuses on building a file-matching program, commonly used in real-world accounts
receivable systems. It involves reading a master file (oldmast.txt) and a transaction
file (trans.txt) to update account balances, then writing the results to a new master
file (newmast.txt). Unmatched records should be logged.

Part a) Define class TransactionRecord
Purpose: Create a class to store individual transaction data.

Attributes:
accountNumber (int)
amount (double)

Behavior:
Include get and set methods to access and modify the account number and amount.
 */


import java.io.Serializable;

public class TransactionRecord implements Serializable {
    private int accountNumber;
    private double amount;

    // Constructor
    public TransactionRecord(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    // Account
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Amount
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
