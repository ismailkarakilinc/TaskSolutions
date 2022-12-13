package day22_ArrayList;

import java.util.ArrayList;

public class Combine {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C","3"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList <String> result = new ArrayList<>();
        for ( String each1 : arr1) {
            result.add(each1);
        }
        for (String each2 : arr2){
            result.add(each2);
        }
        System.out.println(result);


    }
}
/*
7. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
