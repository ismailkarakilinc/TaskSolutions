package day07_ifStatements;

public class CappuccinoBuyer {

    public static void main(String[] args) {

      /*
      1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if

       */

        String size ="Venti";

        if (size == "Tall" || size=="Grande" ||size=="Venti") {
            if (size == "Tall") {
                System.out.println(size + ": Price is $3.69\n\t\t90 calories");
            } else if (size == "Grande") {
                System.out.println(size + ": Price is $3.99\n\t\t120 calories");
            } else {
                System.out.println(size + ": Price is $4.29\n\t\t150 calories");
            }
        } else {
            System.out.println("Invalid size");
        }
    }
}


