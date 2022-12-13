package day06_ifStatements;

public class MedianNumber {

    public static void main(String[] args) {

        /*
        1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
         */

        int a = 10 , b = 8 , c = 20;
        String result = "";

        if (a>b && a<c || a>c && a<b){
            result=(a + " is the median number");
        }
        if (b>a && b<c || b<a && b>c){
            result=(b + " is the median number");
        }
        if (c>a && c<b || c<a && c>b){
            result=(c + " is the median number");
        }
        System.out.println(result);
    }
}
