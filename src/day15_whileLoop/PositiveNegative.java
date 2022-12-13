package day15_whileLoop;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        String result = "";

        for (int i = 1; i<=5 ; i++) {

            System.out.print("Please enter number: ");

            result += input.next() ;
        }
            String negative = result.replace("-","");
            int negativeNumbers = result.length() - negative.length();

        System.out.println((5 - negativeNumbers) + " pozitive numbers and " + negativeNumbers + " negative numbers.");




    }
}
/*
2. Create a class named PositiveNegative and write a program that asks user to enter number for 5 times,
and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative


 */
