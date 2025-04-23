package chapter5.exercises;
/*
    5.33 (Facebook User Base Growth) According to CNNMoney.com, Facebook hit one billion
    users in October 2012. Using the compound-growth technique you learned in Fig. 5.6 and
    assuming its user base grows at a rate of 4% per month, how many months will it take
    for Facebook to grow its user base to 1.5 billion users? How many months will it take
    for Facebook to grow its user base to two billion users?
 */

public class FacebookUserBaseGrowth {
    public static void main(String[] args) {
        double currentUserBase = 1000000000.0; // Starting;
        double targetUserBase1 = 1500000000.0; // Target = 1.5 billion
        double targetUserBase2 = 2000000000.0; // Target = 2.0 billion
        double growthRate = 0.04;

        int month = 0;
        boolean reached1_5B = false;
        boolean reached2B = false;

        // display headers
        System.out.printf("%s%20s%n", "Month", "User Base");

        while (!reached2B){
            double newUserBase = currentUserBase*Math.pow(1+growthRate,month);
            if (!reached1_5B && newUserBase>=targetUserBase1){
                System.out.printf("%4d%,20.2f ← Reached 1.5 Billion%n", month, newUserBase);

                reached1_5B=true;
            }
            if (!reached2B && newUserBase>=targetUserBase2){
                System.out.printf("%4d%,20.2f ← Reached 1.5 Billion%n", month, newUserBase);
                reached2B=true;
            }
            month++;
        }
    }
}
