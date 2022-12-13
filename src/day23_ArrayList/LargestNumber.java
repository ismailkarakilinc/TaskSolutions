package day23_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class LargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(8);

        int n = 2;
        Integer max = -2147483648;
        for (int i = 0; i < n; i++) {
            max = Collections.max(list);
            list.removeAll(Arrays.asList(max));

        }

        System.out.println(max);


    }
}





/*
5. write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4

                int n = 6;
        int max ;
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            result.add(each);
            if (each == n){
                break;

            }
        }
        // System.out.println(result);

        result.remove(result.size()-1);
        max = Collections.max(result);
        System.out.println(max);


 */
