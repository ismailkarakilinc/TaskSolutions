package day13_customMethods;

public class isOdd {

    public static void main(String[] args) {

        System.out.println(isOdd(-101));

    }

    public static boolean isOdd ( int num){

         if (num % 2 == 1){
             return true;
        }else {
             return false;
         }
    }
}
/*
1. Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false

 */
