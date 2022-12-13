package day14_forLoop;

import java.util.Scanner;

public class SumOfDigits {

    private static int i;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input: ");

        String writen = input.next();

        String digits = "";

        int result = 0;




        for (int i = 0 ; i < writen.length() ; i++){
            if ('0' <= writen.charAt(i) && '9'>= writen.charAt(i)){
            result += (writen.charAt(i)-48) ;
            }
        }
        System.out.println("Result = " + result);


   }
}
/*

6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1

 */
