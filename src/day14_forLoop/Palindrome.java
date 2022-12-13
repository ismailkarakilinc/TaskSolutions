package day14_forLoop;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input: ");

        String sentence = input.nextLine();

        String reverse = "";

        for (int i = sentence.length() - 1 ; i >= 0; i--){
            reverse += sentence.charAt(i);
        }
        System.out.println(reverse);

    }
}
