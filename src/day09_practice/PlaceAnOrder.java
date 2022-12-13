package day09_practice;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Write the product name :");
        String product = input.nextLine();

        System.out.print("Enter the price :");
        double price = input.nextDouble();

        System.out.print("Enter the quantity :");
        int quantity = input.nextInt();

        System.out.print("Enter your first name :");
        String name = input.next();

        double cost = quantity * price;

        System.out.println(name + ", your order for " + quantity + " " + product + " has been places. Your total is "
                + cost + ".");
        }

    }

/*
7. Create a class named PlaceAnOrder:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */
