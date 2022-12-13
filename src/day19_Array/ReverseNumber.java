package day19_Array;

import java.util.Arrays;

public class ReverseNumber {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reverse = new int[array.length];

        for (int i = array.length-1, j=0 ; i >= 0 ; i--,j++){
           reverse[j] = array[i];
        }
        System.out.println("Reverse Array = " + Arrays.toString(reverse));


    }
}
/*
6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */
