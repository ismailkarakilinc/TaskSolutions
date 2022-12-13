package day11_string;

public class EmailTask1 {

    public static void main(String[] args) {

        String gmail = "mike_tyson@gmail.com";
        int underscore = gmail.indexOf("_");
        int at = gmail.indexOf("@");

        String firstName = gmail.substring(0,underscore);
        String lastName = gmail.substring(underscore + 1 ,at);
        String domain = gmail.substring(at);


        if (gmail.contains("_")) {
            System.out.println(gmail);
        } else {
            System.out.println(lastName + underscore + firstName + domain);
        }
    }
}

/*
8. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com

 */
