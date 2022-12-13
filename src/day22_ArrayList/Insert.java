package day22_ArrayList;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int[] arr1 = insert(arr,2,22);
        System.out.println(Arrays.toString(arr1));

    }

    public static int[] insert (int[] array, int index, int element){
        for (int i = 0; i < array.length+1; i++) {
            array[index] = element;
        }
        return array;
    }



}
/*
3. Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array
 */
