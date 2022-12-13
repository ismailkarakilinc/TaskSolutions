package day20_ForEach;

public class EvenAndOddNumber {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 45, 5, 6};

        int oodResult = 0;
        int evenResult = 0;

        for (int each:numbers) {

            if (each%2==0){
                evenResult = each;
                System.out.println(evenResult + " is even number");

            }else {
                oodResult = each;
                System.out.println(oodResult + " is odd number");

            }

        }




    }
}
/*
2.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */
