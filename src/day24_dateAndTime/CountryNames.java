package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("United States","Turkiye","Canada","Germany","France","Italy"));

        list.removeIf(p->p.length()>=10);
        System.out.println(list);


    }
}
/*
6. Create an ArrayList of string called country names, write a program that can remove all the country names that have
 length of 10 or greater
 */
