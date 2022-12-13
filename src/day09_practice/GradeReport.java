package day09_practice;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {


        String result = "Invalid score.";

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your score : ");

        int score = input.nextInt();

        if (score<=100 && score>=0){
            if (score>=90){
                result="A";
            } else if (score<90 && score>=80){
                result="B";
            }else if (score<80 && score>=70){
                result="C";
            }else if (score<70 && score>=60){
                result="D";
            }else {
                result = "F";
            }
            System.out.println("Result :" + result);
            }else{
                System.out.println("Result :" + result);
            }

        }

    }

/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */
