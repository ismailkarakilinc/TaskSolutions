package day14_forLoop;

public class Shape {

    public static void main(String[] args) {

        String star = "";

        for (int i = 1; i < 9; i++) {
            for (int k = 1; k < 7; k++) {

                star += ("*" + " ");

            }
            star += "\n";
        }
        System.out.println(star);

    }
}
/*
1. Use a loop to print the following shape:

                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

 */
