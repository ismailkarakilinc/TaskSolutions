package day06_ifStatements;

public class PosNegZero {

    public static void main(String[] args) {

        /*
        1. Create a class named PosNegZero.java
        2. An integer variable named number is declared and given, Write a
        program can identify if the number is positive, negative or zero
            Ex:
            number = 20
            output:
            Positive

         */

        int number = 0;

        if (number > 0){
            System.out.println("Pozitive");
        }
        if (number<0){
            System.out.println("Negative");
        }
        if (number==0){
            System.out.println("Zero");
        }
    }
}
