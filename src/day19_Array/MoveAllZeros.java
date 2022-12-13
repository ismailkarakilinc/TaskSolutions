package day19_Array;

import java.util.Arrays;

public class MoveAllZeros {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};

       // Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        for (int i = 0 ; i < array.length ; i++) {

           if (array[i] == 0){
               for (int j = i; j < array.length; j++) {
                   if (array[j] != 0){
                       array[i] = array[j];
                       array[j] = 0;
                       break;
                   }

               }
           }

        }
        System.out.println(Arrays.toString(array));


        }

    }

/*
7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */
