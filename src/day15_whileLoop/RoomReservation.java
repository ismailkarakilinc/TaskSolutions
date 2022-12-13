package day15_whileLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want reserve a room ?");
        String answer = input.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.err.println("Invalid entry!!! Re-answer:");
            answer = input.next();
        }



            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("What type of room do u want?");
                String roomType = input.nextLine();

                input.nextLine();

                while (!(roomType.equalsIgnoreCase("king bed") || roomType.equalsIgnoreCase("queen " +
                        "bed") || roomType.equalsIgnoreCase("single bed"))){
                    System.err.println("Invalid entry!!! Please re-select your room type.");
                    roomType = input.nextLine();
                }

                if (roomType.equalsIgnoreCase("king bed")) {
                    System.out.println("Your price is 120$.");
                } else if (roomType.equalsIgnoreCase("queen bed")) {
                    System.out.println("Your price is 100$");
                } else {
                    System.out.println("Your price is 80$");
                }

            } else {
                System.out.println("Have a nice day.");
            }
        }
    }

/*
8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to
reserve a room.if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print
"have a nice day"(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid
 entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */
