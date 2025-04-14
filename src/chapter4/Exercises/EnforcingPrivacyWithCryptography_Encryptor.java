package chapter4.Exercises;
/*
    4.38 (Enforcing Privacy with Cryptography) The explosive growth of Internet communications
and data storage on Internet-connected computers has greatly increased privacy concerns. The field
of cryptography is concerned with coding data to make it difficult (and hopefully—with the most
advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a
simple scheme for encrypting and decrypting data. A company that wants to send data over the Internet has asked you to write a program that will encrypt it so that it may be transmitted more securely. All the data is transmitted as four-digit integers. Your application should read a four-digit
integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
encryption scheme) to form the original number. [Optional reading project: Research “public key
cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]
 */

public class EnforcingPrivacyWithCryptography_Encryptor {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        int number = input.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Invalid input. Please enter a four-digit integer.");
            return;
        }

        int digit1 = number / 1000;
        int digit2 = (number % 1000) / 100;
        int digit3 = (number % 100) / 10;
        int digit4 = number % 10;

        digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;

        int encryptedNumber = digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;
        System.out.println("The encrypted integer is: " + encryptedNumber);

        System.out.print("Enter an encrypted four-digit integer: ");
        int encrypted = input.nextInt();

        if (encrypted < 1000 || encrypted > 9999) {
            System.out.println("Invalid input. Please enter a four-digit integer.");
            return;
        }

        int eDigit1 = encrypted / 1000;
        int eDigit2 = (encrypted % 1000) / 100;
        int eDigit3 = (encrypted % 100) / 10;
        int eDigit4 = encrypted % 10;

        int temp = eDigit1;
        eDigit1 = eDigit3;
        eDigit3 = temp;

        temp = eDigit2;
        eDigit2 = eDigit4;
        eDigit4 = temp;

        eDigit1 = (eDigit1 + 10 - 7) % 10;


    }
}