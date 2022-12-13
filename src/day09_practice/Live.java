package day09_practice;

import java.util.Scanner;

public class Live {

    public static void main(String[] args) {


        String result = "";

        Scanner input = new Scanner(System.in);

        System.out.print("How many people they live with : ");

        int person = input.nextInt();

        if (person<3){
            result="Live with less than 3 people.";
        } else if (person>=3 && person<=6) {
            result="Live with 3 - 6 people.";
        }else {
            result="Live with more than 6 people.";
        }
        System.out.println(result);


    }
}

/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */