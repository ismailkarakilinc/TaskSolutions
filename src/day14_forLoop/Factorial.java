package day14_forLoop;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int num = input.nextInt();

        int num1 = 1;


        for (int i = num ; i >= 1 ; i--){

            num1 *= i;

        }
        System.out.println(num + "!: "  + num1);
    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
