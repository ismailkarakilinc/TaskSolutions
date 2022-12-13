package day11_string;

public class EmailTask2 {

    public static void main(String[] args) {

        String email = "ismail_karakilinc@gmail.com";

        int underscore = email.indexOf("_");
        int at = email.indexOf("@");
        int dot = email.indexOf(".");

        String firstName = email.substring(0,underscore);
        String lastName = email.substring(underscore + 1,at);
        String domain = email.substring(at+1,dot);

        String firstName1 = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String lastName1 = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("First name: " + firstName1);
        System.out.println("Last name: " + lastName1);
        System.out.println("Domain: " + domain);

    }
}
/*
9. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */
