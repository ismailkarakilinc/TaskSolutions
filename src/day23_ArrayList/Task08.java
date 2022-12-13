package day23_ArrayList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class Task08 {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        char[] ch = str.toCharArray();

        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();

        for (char each : ch) {
            if (!Character.isLetterOrDigit(each)){
                characters.add(each);
            } else if (Character.isDigit(each)){
                digits.add(each);
            }else {
                letters.add(each);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("characters = " + characters);
    }
}
/*
8. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}

 */
