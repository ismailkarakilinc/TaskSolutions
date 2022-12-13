package day16_loopsContinue;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        String bedroomtype;

        int night = 1;

        int result = 1;

        while (answer.equals("yes")) {


            System.out.println("Which bedroom do you want to reserve ? King/Queen/Single");

            String bedroomType = input.next().toLowerCase();

            while (!(bedroomType.equals("king") || bedroomType.equals("queen") || bedroomType.equals("single"))) {
                System.err.println("Invalid entry!!! Please re-enter the informations");
                bedroomType = input.next();
            }

            System.out.println("How many nights do you want to stay?");

            night = input.nextInt();

            while (night <= 0) {
                System.err.println("Invalid entry!!! Please re-enter the informations");
                night  = input.nextInt();
            }



            if (bedroomType.equals("king")) {
               result = 120 * night;
                System.out.println(result);
            } else if (bedroomType.equals("queen")) {
                result = 100 * night;
                System.out.println(result);
            } else {
                result = 80 * night;
                System.out.println(result);
            }
            System.out.println("Would you like to reserve another room?Yes/No");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid entry!!! Please re-answer");
            }

            if (answer.equals("no")){
                System.out.println(result+=result);;

            }

        }
    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

                If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */
