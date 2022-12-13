package day13_customMethods;

import java.util.Scanner;

public class Title {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a word: ");

        String argument = input.next();

        System.out.println(title(argument));




    }
    public static String title (String argument){

        return argument.substring(0,1).toUpperCase() + argument.substring(1).toLowerCase();


    }

}
/*

7. Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java
 */
