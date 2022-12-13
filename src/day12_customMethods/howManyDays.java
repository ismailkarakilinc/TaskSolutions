package day12_customMethods;

import java.util.Scanner;

public class howManyDays {

    public static void main(String[] args) {

        DasyOfTheMonth();

    }

    public static void DasyOfTheMonth() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter the month name:");

        String month = input.next();

        month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();


        if ((month.equals("April")) || (month.equals("June")) || (month.equals("September")) ||
                (month.equals("November"))) {
            System.out.println(month + " has 30 Days");
        } else if ((month.equals("January")) || (month.equals("March")) || (month.equals("May")) ||
                (month.equals("July")) || (month.equals("August")) || (month.equals("October"))
                || (month.equals("December"))) {
            System.out.println(month + " has 31 Days");
        } else {
            System.out.println(month + " has 28 Days");

            }
        }
    }
/*
5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */

