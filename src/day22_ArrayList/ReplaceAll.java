package day22_ArrayList;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 7, 8, 23, 654, 23, 23, 1, 23};
        int[] arr1 = replace(arr,23,0);
        System.out.println(Arrays.toString(arr1));



    }
    public static int[] replace(int[] array,int oldelement, int newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldelement){
                array[i] = newElement;
            }
        }
        return array;
    }
    public static double[] replace(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }
    public static char[] replace(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }
    public static String[] replace(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)){
                array[i] = newElement;
            }
        }
        return array;
    }
}

/*
2. ReplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays


 */
