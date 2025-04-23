package chapter5.exercises;
/*
    5.31 (Global Warming Facts Quiz) The controversial issue of global warming has been widely
publicized by the film “An Inconvenient Truth,” featuring former Vice President Al Gore. Mr. Gore
and a U.N. network of scientists, the Intergovernmental Panel on Climate Change, shared the 2007
Nobel Peace Prize in recognition of “their efforts to build up and disseminate greater knowledge
about man-made climate change.” Research both sides of the global warming issue online (you
might want to search for phrases like “global warming skeptics”). Create a five-question multiplechoice quiz on global warming, each question having four possible answers (numbered 1–4). Be objective and try to fairly represent both sides of the issue. Next, write an application that administers
the quiz, calculates the number of correct answers (zero through five) and returns a message to the
user. If the user correctly answers five questions, print “Excellent”; if four, print “Very good”; if
three or fewer, print “Time to brush up on your knowledge of global warming,” and include a list
of some of the websites where you found your facts.
 */

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int correctAnswers = 0;
        int userAnswer;

        System.out.println("Welcome to the Global Warming Facts Quiz!\n");

        // Question 1
        System.out.println("1. Which gas is considered the primary contributor to global warming?");
        System.out.println("1) Oxygen");
        System.out.println("2) Nitrogen");
        System.out.println("3) Carbon Dioxide");
        System.out.println("4) Helium");
        System.out.print("Your answer (1-4): ");
        userAnswer = input.nextInt();
        if (userAnswer == 3) {
            correctAnswers++;
        }

        // Question 2
        System.out.println("\n2. Which organization shared the 2007 Nobel Peace Prize for work on climate change?");
        System.out.println("1) NASA");
        System.out.println("2) Intergovernmental Panel on Climate Change");
        System.out.println("3) Greenpeace");
        System.out.println("4) World Bank");
        System.out.print("Your answer (1-4): ");
        userAnswer = input.nextInt();
        if (userAnswer == 2) {
            correctAnswers++;
        }

        // Question 3
        System.out.println("\n3. What is the stance of global warming skeptics?");
        System.out.println("1) They support urgent climate action");
        System.out.println("2) They deny climate change entirely");
        System.out.println("3) They question the extent and cause");
        System.out.println("4) They advocate for fossil fuels");
        System.out.print("Your answer (1-4): ");
        userAnswer = input.nextInt();
        if (userAnswer == 3) {
            correctAnswers++;
        }

        // Question 4
        System.out.println("\n4. Which of these is a potential impact of global warming?");
        System.out.println("1) Melting ice caps");
        System.out.println("2) Decreasing sea levels");
        System.out.println("3) Thicker ozone layer");
        System.out.println("4) Less rainfall globally");
        System.out.print("Your answer (1-4): ");
        userAnswer = input.nextInt();
        if (userAnswer == 1) {
            correctAnswers++;
        }

        // Question 5
        System.out.println("\n5. What is the purpose of the Paris Agreement?");
        System.out.println("1) Promote fossil fuel use");
        System.out.println("2) Encourage trade agreements");
        System.out.println("3) Limit global temperature rise");
        System.out.println("4) Build nuclear weapons");
        System.out.print("Your answer (1-4): ");
        userAnswer = input.nextInt();
        if (userAnswer == 3) {
            correctAnswers++;
        }

        // Results
        System.out.printf("%nYou got %d out of 5 correct.%n", correctAnswers);

        if (correctAnswers == 5) {
            System.out.println("Excellent!");
        } else if (correctAnswers == 4) {
            System.out.println("Very good!");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Here are some useful resources:");
            System.out.println("- https://climate.nasa.gov/");
            System.out.println("- https://www.ipcc.ch/");
            System.out.println("- https://skepticalscience.com/");
            System.out.println("- https://www.epa.gov/climate-change");
        }

        input.close();
    }
}