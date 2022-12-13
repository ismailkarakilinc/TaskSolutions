package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveName {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("John");
        list.add("Ahmed");
        list.add("Daniel");
        list.add("Ahmed");
        list.add("James");
        list.add("Muhammed");

        list.removeAll(Arrays.asList("Ahmed"));
        System.out.println(list);



    }
}
/*
3. Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];

            	 ArrayList<String> result = new ArrayList<>();

        for (String each : list) {
            result.add(each);

            if (result.contains("Ahmed")) {
                result.remove("Ahmed");
            }
        }
        System.out.println(result);
 */
