package Patika;

import java.util.Scanner;

public class LastDigit {

    public static void main(String[] args) {

        lastDigit();
    }

    public static void lastDigit(){

        Scanner input = new Scanner(System.in);

        System.out.print("Could you please write a number: ");

        int number = input.nextInt();

        int result = number%10;

        if (number>0){
            System.out.println(result + " is last digit of " + number);
        } else if (number==0) {
            System.out.println("Please enter diffirent number from 0");
        }else {
            System.out.println(result*(-1) + " is last digit of " + number);
        }
    }
}
