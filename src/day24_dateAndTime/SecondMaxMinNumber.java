package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMinNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        int n = 2;
        Integer max = 0; //The smallest value that an integer can take ( you can assign any other numbers).
        for (int i = 0; i < n; i++) {
            max = Collections.max(list);
            list.removeAll(Arrays.asList(max));

        }

        System.out.println("Second maximum number is " + max);

        Integer min = 0;
        for (int i = 0; i < n; i++) {
            min = Collections.min(list);
            list.removeAll(Arrays.asList(min));
        }
        System.out.println("Second minimum number is " + min);


    }
}
/*
5. Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops
 */
