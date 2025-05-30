package chapter15.exercises;
/*
Exercise: 15.4 (File Matching)
This problem focuses on building a file-matching program, commonly used in real-world accounts
receivable systems. It involves reading a master file (oldmast.txt) and a transaction
file (trans.txt) to update account balances, then writing the results to a new master
file (newmast.txt). Unmatched records should be logged.

Part b) Modify class Account
Purpose: Enhance the existing Account class (from Fig. 15.9) to support transaction updates.
New Method: combine(TransactionRecord)
Adds the transaction amount from a TransactionRecord object to the account’s balance.
 */

import java.io.Serializable;

public class Account implements Serializable {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    // Initializes an Account with default values
    public Account() {
        this(0, "", "", 0.0); // call other constructor
    }

    // Initializes an Account with provided values
    public Account(int account, String firstName, String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // Setters and Getters
    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // New method to combine transaction amount with balance
    public void combine(TransactionRecord transaction) {
        this.balance += transaction.getAmount();
    }


}
