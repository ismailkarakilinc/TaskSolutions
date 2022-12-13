package day22_ArrayList;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] array1 = replace(arr,3,20);

        System.out.println(Arrays.toString(array1));




        
    }

    public static int[] replace(int[] array,int index, int newElement){
        for (int i = 0; i < array.length; i++) {
            array[index] = newElement;

        }
        return array;
    }
    public static double[] replace(double[] array, int index, double newElement){
        for (double i = 0; i < array.length; i++) {
            array[index] = newElement;

        }
        return array;
    }
    public static char[] replace(char[] array, int index, char newElement){
        for (char i = 0; i < array.length; i++) {
            array[index] = newElement;

        }
        return array;
    }
    public static String[] replace(String[] array, int index, String newElement){
        for (int i = 0; i < array.length; i++) {
            array[index] = newElement;

        }
        return array;
}
}
/*
1. Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}

        1.2 Create the same functions for double arrays, char arrays, and String arrays


 */
