package day11_string;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("First name= ");
        String firstName = input.next();

        System.out.println("Last name= ");
        String lastName = input.next();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);
    }
}
/*

7. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */
