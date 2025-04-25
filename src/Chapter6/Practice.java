package Chapter6;

import java.security.SecureRandom;

public class Practice {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int randomValue1 = randomNumbers.nextInt(6);
        int randomValue2 = randomNumbers.nextInt(6);
        int randomValue3 = randomNumbers.nextInt(6);

        System.out.println(randomValue1);
        System.out.println(randomValue2);
        System.out.println(randomValue3);

    }
}
