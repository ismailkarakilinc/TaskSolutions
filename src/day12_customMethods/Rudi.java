package day12_customMethods;

import java.util.Scanner;

public class Rudi {
    public static void main(String[] args) {


        DaysOfTheMonth();

    }

    public static void DaysOfTheMonth (){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the month: ");
        String month = input.next();

        String numberOfDays = (month.equals("February"))? "28 Days"
                : (month.equals("April")) ? "30 Days" : (month.equals("June"))? "30 Days"
                : (month.equals("September"))? "30 Days" : (month.equals("November"))? "30 Days"
                : (month.equals("January"))? "31 Days" : (month.equals("March"))? "31 Days"
                : (month.equals("July"))? "31 Days" : (month.equals("August"))? "31 Days"
                : (month.equals("October"))? "31 Days" : (month.equals("December"))? "31 Days"
                : "Invalid Entry";

        System.out.println(numberOfDays);

        input.close();
    }
}
