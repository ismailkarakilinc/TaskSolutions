package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {

            if (each % 2 != 0 ){
                each = each*2;
            }
            result.add(each);
        }
        System.out.println(result);
    }
}
/*
7. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]
 */
