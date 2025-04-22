package chapter5.exercises;
/*
    5.29 (“The Twelve Days of Christmas” Song) Write an application that uses repetition
    and switch statements to print the song “The Twelve Days of Christmas.” One switch statement
    should be used to print the day (“first,” “second,” and so on). A separate switch statement
    should be used to print the remainder of each verse. Visit the website
    en.wikipedia.org/wiki/The_Twelve_Days_of_Christmas_(song) for the lyrics of the song.
 */

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        for (int day = 1; day <= 12; day++) {
            String dayName;
            switch (day) {
                case 1:
                    dayName = "first";
                    break;
                case 2:
                    dayName = "second";
                    break;
                case 3:
                    dayName = "third";
                    break;
                case 4:
                    dayName = "fourth";
                    break;
                case 5:
                    dayName = "fifth";
                    break;
                case 6:
                    dayName = "sixth";
                    break;
                case 7:
                    dayName = "seventh";
                    break;
                case 8:
                    dayName = "eighth";
                    break;
                case 9:
                    dayName = "ninth";
                    break;
                case 10:
                    dayName = "tenth";
                    break;
                case 11:
                    dayName = "eleventh";
                    break;
                case 12:
                    dayName = "twelfth";
                    break;
                default:
                    dayName = "";
                    break;
            }
            System.out.println("On the " + dayName + " day of Christmas");
            for (int gift = day; gift >= 1; gift--) {
                String giftItem;
                switch (gift) {
                    case 1:
                        giftItem = "a Partridge in a Pear Tree";
                        break;
                    case 2:
                        giftItem = "Two Turtle Doves";
                        break;
                    case 3:
                        giftItem = "Three French Hens";
                        break;
                    case 4:
                        giftItem = "Four Calling Birds";
                        break;
                    case 5:
                        giftItem = "Five Gold Rings";
                        break;
                    case 6:
                        giftItem = "Six Geese a Laying";
                        break;
                    case 7:
                        giftItem = "Seven Swans a Swimming";
                        break;
                    case 8:
                        giftItem = "Eight Maids a Milking";
                        break;
                    case 9:
                        giftItem = "Nine Ladies Dancing";
                        break;
                    case 10:
                        giftItem = "Ten Lords a Leaping";
                        break;
                    case 11:
                        giftItem = "Eleven Pipers Piping";
                        break;
                    case 12:
                        giftItem = "Twelve Drummers Drumming";
                        break;
                    default:
                        giftItem = "";
                        break;
                }
                System.out.print(giftItem);
                if (gift > 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(".\n");
        }
    }
}
