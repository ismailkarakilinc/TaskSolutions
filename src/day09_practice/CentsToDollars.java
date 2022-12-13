package day09_practice;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter cents : ");

        int cents = input.nextInt();

        System.out.println( cents + " cents equal to: " + (cents - cents % 100) / 100 + " dollars and " + cents % 100 +
                " cents"  );



    }
}
/*
5. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */
