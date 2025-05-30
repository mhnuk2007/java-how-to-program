package chapter15.exercises;
/*
Exercise: 15.4 (File Matching)
This problem focuses on building a file-matching program, commonly used in real-world accounts
receivable systems. It involves reading a master file (oldmast.txt) and a transaction
file (trans.txt) to update account balances, then writing the results to a new master
file (newmast.txt). Unmatched records should be logged.

Part d) Create class FileMatch
Purpose: Main class to implement the file-matching logic.

Responsibilities:
Read: Load oldmast.txt and trans.txt (both sorted by account number).

Match & Update:
If both have the same account number, update the balance.
If an account in oldmast.txt has no matching transaction, just copy it.
If a transaction has no matching master record, log it.

Write:
Output the updated records to newmast.txt.
Log unmatched transactions to log.txt.
 */

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class FileMatch {
    public static void main(String[] args) {

        try (
                Scanner inMaster = new Scanner(Paths.get("oldmast.txt"));
                Scanner inTransaction = new Scanner(Paths.get("trans.txt"));
                Formatter outNewMaster = new Formatter("newmast.txt");
                Formatter outLog = new Formatter("log.txt");
                ) {
            List<Account> masterList = new ArrayList<>();
            List<TransactionRecord> transactionList = new ArrayList<>();
            // Load master records
            while (inMaster.hasNext()) {
                int acct = inMaster.nextInt();
                String first = inMaster.next();
                String last = inMaster.next();
                double balance = inMaster.nextDouble();
                masterList.add(new Account(acct, first, last, balance));
            }

            // Load transaction records
            while (inTransaction.hasNext()) {
                int acct = inTransaction.nextInt();
                double amount = inTransaction.nextDouble();
                transactionList.add(new TransactionRecord(acct, amount));
            }

            // Process matching
            for(Account acc:masterList){
                int AccNum = acc.getAccount();
                boolean matched = false;
                for (int i = 0; i<transactionList.size(); i++){
                    TransactionRecord tr = transactionList.get(i);
                    if(tr.getAccountNumber()==AccNum){
                        acc.combine(tr);
                        transactionList.remove(i); // remove matched transaction
                        matched = true;
                        break;
                    }
                }
                // Write updated record
                outNewMaster.format("%d %s %s %.2f\n", AccNum, acc.getFirstName(), acc.getLastName(), acc.getBalance());
            }

            // Log unmatched transactions
            for (TransactionRecord tr : transactionList) {
                outLog.format("Unmatched transaction record for account number %d%n", tr.getAccountNumber());
            }

            System.out.println("File matching completed.");

        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }
}
