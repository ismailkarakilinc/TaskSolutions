package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoString {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};


        ArrayList<String> arr3 = new ArrayList<>();
        arr3.addAll(Arrays.asList(arr1));
        arr3.addAll(Arrays.asList(arr2));
        System.out.println(arr3);




    }
}
/*
2. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};

	            output:
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

	    ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("D");
        arr2.add("E");
        arr2.add("F");
        arr2.add("G");
 */
