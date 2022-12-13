package day11_string;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Split or No split: ");
        String split = input.next();
        System.out.print("Enter the number of people: ");
        int numberOfPeople = input.nextInt();
        System.out.print("Enter the check amount: ");
        int checkAmount = input.nextInt();
        System.out.print("Service Quality: ");
        String serviceQuality = input.next();

        double totalTip = 0;

        if (serviceQuality.equalsIgnoreCase("excellent")) {
            totalTip = checkAmount * 0.25;
        } else if (serviceQuality.equalsIgnoreCase("great")) {
            totalTip = checkAmount * 0.20;
        } else if (serviceQuality.equalsIgnoreCase("good")) {
            totalTip = checkAmount * 0.15;
        } else if (serviceQuality.equalsIgnoreCase("fair")) {
            totalTip = checkAmount * 0.10;
        } else {
            totalTip = checkAmount * 0.05;
        }
        double totalCheck = checkAmount + totalTip,
                totalPerPerson = totalCheck / numberOfPeople,
                tipPerPerson = totalTip / numberOfPeople;

        if (split.equalsIgnoreCase("yes")) {
            System.out.println("Number of people entered: " + numberOfPeople +
                    "\nTotal to pay: $" + totalCheck + "\nTotal tip: $" + totalTip +
                    "\nTotal per person: $" + totalPerPerson +
                    "\nTip per person: $" + tipPerPerson);
        } else {
            System.out.println("Number of people entered: " + numberOfPeople +
                    "\nTotal to pay: $" + totalCheck + "\nTotal tip: $" + totalTip);
        }
    }
}


/*
10. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75

 */
