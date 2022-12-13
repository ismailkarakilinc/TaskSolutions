package day16_loopsContinue;

import java.util.Scanner;

public class PerimeterOfSquare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.println("Enter the side of the square: ");
            int sideOfTheSquare = input.nextInt();

            while (sideOfTheSquare == 0 || sideOfTheSquare < 0) {
                System.err.println("Invalid Entry for the side of the square!!! Please re-enter valid entry");
                sideOfTheSquare = input.nextInt();
            }

            int area = sideOfTheSquare * sideOfTheSquare;
            int perimeter = 4 * sideOfTheSquare;

            System.out.println("Area of the square is: " + area);
            System.out.println("Perimeter of the square is: " + perimeter);

            System.out.println("Would you like to calculate another Square?Yes/No");
            answer = input.next().toLowerCase();

            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
            }
            while (!(answer.equals("yes")||answer.equals("no"))){
                System.err.println("Invalid entry!!!Please enter a valid entry");
            }


        }
    }
}
/*

5. Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program


 */
