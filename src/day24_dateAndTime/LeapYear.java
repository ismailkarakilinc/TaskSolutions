package day24_dateAndTime;

import java.time.LocalDate;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1972));
        System.out.println(isLeapYear(1991));



    }

    public static boolean isLeapYear(int birthYear){
        return LocalDate.of(birthYear,1,1).isLeapYear();
    }
}
/*
8. Create a function that accepts an int argument birthYear, return true if the person was born on leap year (FEB 29),
   otherwise return false

 */
