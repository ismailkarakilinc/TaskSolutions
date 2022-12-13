package day20_ForEach;

public class CommonNumbers {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int each1: arr1) {
            for (int i = 0; i < arr2.length; i++) {
                if (each1 == arr2[i]){
                    System.out.print(arr2[i]+" ");
                }
            }

        }

    }
}
/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
 */
