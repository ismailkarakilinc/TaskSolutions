package day15_whileLoop;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Username: ");

        String userName = input.next();

        System.out.print("Password: ");

        String password = input.next();

        String result = "";

        for (int i = 0 ; i < 2 ; i++ ){
            if (!userName.equals("Cydeo") || !password.equals("Cydeo123")){
                System.out.println("Wrong entry!!! Please re-enter your username and password.");
                System.out.print("Username: ");
                userName = input.next();
                System.out.print("Password: ");
                password = input.next();

                result = "Your account is locked.";
            }else {
                result= "Logged in.";

            }
        }
        System.out.println(result);

    }
}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."

 */
