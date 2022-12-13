package day11_string;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word:");

        String word = input.nextLine();

        word= word.toLowerCase();

        String a = word.replace('x','a');

        System.out.println(a);



    }
}
/*
3. Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */