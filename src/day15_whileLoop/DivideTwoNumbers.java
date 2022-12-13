package day15_whileLoop;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int result = 0 ;
        for (int i = num2 ; i <= num1 ; i=i+num2){

           result++;



        }


        System.out.println(result);


    }
}
/*
4.  Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without using
/ (division) and * (multiplication) operators.


 */