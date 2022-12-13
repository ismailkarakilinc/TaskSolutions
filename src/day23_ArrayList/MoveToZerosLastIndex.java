package day23_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveToZerosLastIndex {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(0);
        list.add(2);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(4);
        list.add(7);

        //Cozum 1;

        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("---------------------------------------------------");

        //Cozum 2;

        ArrayList<Integer> result = new ArrayList<>();

        int r1 = 0;

        for (Integer each : list) {
            result.add(each);
            if (each == 0){
                r1++;
            }
        }

        result.removeAll(Arrays.asList(0));

        for (int i = result.size()-1 + r1 ; i >= result.size()-1  ; i--) {
            result.add(0);

        }

        System.out.println(result);






    }
}
/*
6. Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]

                int count = 0;



 */