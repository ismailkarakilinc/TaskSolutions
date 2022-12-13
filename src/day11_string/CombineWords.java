package day11_string;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two words:");

        String word1 = input.next();
        String word2 = input.next();

        int a = word1.length() - 1;

        if (word1.charAt(a) == word2.charAt(0)){
            System.out.println(word1 + word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }
    }
}
/*
6. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight

 */
