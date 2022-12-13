package day04_concatenation;

public class GallonsToLiters {

    public static void main(String[] args) {

        /*
        4. Create a class named GallonsToLiters and declare the following variables:
                gallon
                liters

            4.1 Write a program that can convert the any given number of gallons to liters
                Ex:
                      gallon = 10

                output:
                      10 gallons is equal to 37.9 litters

                   Hint:  1 gal = 3.79 L
         */

        int gallon = 10;
        double litters = 3.79;
        double gallontolitters = gallon*litters;

        System.out.println(gallon + " gallons is equal to " + gallontolitters + " litters");

            }
}
