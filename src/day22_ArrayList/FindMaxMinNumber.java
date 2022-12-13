package day22_ArrayList;

import java.util.ArrayList;

public class FindMaxMinNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int maxNum = list.get(0);
        int minNum = list.get(0);

        for (Integer each : list){
            if (each>maxNum){
                maxNum = each;
            }
            if (each<minNum){
                minNum = each;
            }

        }
        System.out.println("minNum = " + minNum);
        System.out.println("maxNum = " + maxNum);
    }
}

/*
8. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1

 */
