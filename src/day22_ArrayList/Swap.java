package day22_ArrayList;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int[] arr1 = swap(arr,2,1);
        System.out.println(Arrays.toString(arr1));

    }
    public static int[] swap(int[] array, int i , int j ){
        for (int k = 0; k < array.length; k++) {
            if (array[k]==array[i]){
                int swtch = array[i];
                array[i] = array[j];
                array[j] = swtch;
            }

        }
        return array;
    }
    public static double[] swap(double[] array, int i , int j ){
        for (int k = 0; k < array.length; k++) {
            if (array[k]==array[i]){
                double swtch = array[i];
                array[i] = array[j];
                array[j] = swtch;
            }

        }
        return array;
    }
    public static char[] swap(char[] array, int i , int j ){
        for (int k = 0; k < array.length; k++) {
            if (array[k]==array[i]){
                char swtch = array[i];
                array[i] = array[j];
                array[j] = swtch;
            }

        }
        return array;
    }
    public static String[] swap(String[] array, int i , int j ){
        for (int k = 0; k < array.length; k++) {
            if (array[k]==array[i]){
                String swtch = array[i];
                array[i] = array[j];
                array[j] = swtch;
            }

        }
        return array;
}
}
/*
4. Swap Task:
    2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array and string array

 */