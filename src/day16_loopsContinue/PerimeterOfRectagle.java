package day16_loopsContinue;

import java.util.Scanner;

public class PerimeterOfRectagle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.println("Enter the length of the Rectangle:");
            int length = input.nextInt();

            while (length == 0 || length < 0) {
                System.err.println("Invalid Entry for the length of the rectangle!!! Please re-enter length of the rectagle");
                length = input.nextInt();
            }

            System.out.println("Enter the width of the Rectangle:");
            int width = input.nextInt();

            while (width == 0 || width < 0) {
                System.err.println("Invalid Entry for the width of the rectangle!!! Please re-enter width of the rectagle");
                width = input.nextInt();
            }

            int area = length * width;
            int perimeter = (length + width) * 2;

            System.out.println("Perimeter of the rectangle is : " + perimeter);
            System.out.println("Area of the rectangle is : " + area);

            System.out.println("Would you like to calculate another Rectangle?Yes/No");

            answer = input.next().toLowerCase();

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
            }
            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid entry!!! Please enter a valid entry");
                answer = input.next().toLowerCase();
            }


        }
    }
}
/*
6. Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */
