package day20_ForEach;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence = "I love Java";

        String[] words = sentence.split(" ");

        String reverseword = "";

        for (int i = words[1].length()-1; i >= 0 ; i--) {
            reverseword += words[1].charAt(i);

        }

        System.out.println(reverseword);

    }
}
/*
1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java

 */
