package day14_forLoop;

import java.util.Scanner;

public class Retrive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");

        String word = input.next();

        String letter = "";
        String number = "";
        String character = "";

        for ( int i = 0 ; i < word.length() ; i++){
            if ('0' <= word.charAt(i) && '9' >= word.charAt(i)){
                number += word.charAt(i);
            } else if ('A'<= word.charAt(i) && 'Z'>= word.charAt(i) || 'a'<= word.charAt(i) && 'z'>= word.charAt(i)){
                letter += word.charAt(i);
            } else {
                character += word.charAt(i);
            }
        }
        System.out.println("letter = " + letter);
        System.out.println("number = " + number);
        System.out.println("character = " + character);
    }
}
/*
5. write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */
