package day11_string;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 words:");

        String word1 = input.next();
        String word2 = input.next();

        String withoutFirstCh = word1.substring(1);
        String withoutSecondCh = word2.substring(1);

        System.out.println(withoutFirstCh+withoutSecondCh);


    }
}
/*
5. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */
