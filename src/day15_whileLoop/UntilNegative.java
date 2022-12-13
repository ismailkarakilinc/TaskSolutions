package day15_whileLoop;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");


        int sum = 0;

        for (int i = input.nextInt(); i > 0; i = input.nextInt()) {

            sum += i;

        }
        System.out.println(sum);
    }
}

/*
5. Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user
 until user enters a negative number.

 */
