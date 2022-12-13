package day13_customMethods;

import java.util.Scanner;

public class Combine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first word:");
        String firstWord = input.next();

        System.out.print("Please enter the second word:");
        String secondWord = input.next();

        System.out.println(combine(firstWord,secondWord));
    }
    public static String combine(String firstWord, String secondWord){

        String result;

        if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)){
            return result =firstWord + secondWord.substring(1);
        }else {
            return result = firstWord+secondWord;
        }
    }

}
/*
5.  Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight

 */
