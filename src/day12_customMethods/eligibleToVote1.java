package day12_customMethods;

import java.util.Scanner;

public class eligibleToVote1 {

    public static void main(String[] args) {

        eligibleToVote();

    }
    public static void eligibleToVote(){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Are you American?: ");
        boolean isAmerican = input.hasNextBoolean();


        if (age>=18 && isAmerican==true){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

    }
}
/*
6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
 */
