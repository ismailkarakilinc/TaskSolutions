package day16_loopsContinue;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String result ;
        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.print("Enter your score: ");
            int score = input.nextInt();

            while (score < 0 || score > 100) {
                System.err.println("Invalid entry!!! Please re-enter your score");
                score = input.nextInt();
            }
            if (score >= 90) {
                result = "Your score is A";
            } else if (score >= 80) {
                result = "Your score is B";
            } else if (score >= 70) {
                result = "Your score is C";
            } else if (score >= 60) {
                result = "Your score is D";
            } else {
                result = "Your score is F";
            }
            System.out.println(result);

            System.out.println("Would you like to continue?Yes/No");
            answer = input.next().toLowerCase();

            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
            }
            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid entry!!! Please re-enter");
            }


        }
    }
}
/*
7. Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
 */
