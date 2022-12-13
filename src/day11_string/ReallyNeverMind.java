package day11_string;

import java.util.Scanner;

public class ReallyNeverMind {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word:");

        String word = input.nextLine();

        boolean ly = word.endsWith("ly");

        if (ly == true){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }

    }
}
/*
4. Create a class named ReallyNeverMind. Ask the user to enter a word.
    if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

 */
