package day22_ArrayList;

import java.util.Arrays;

public class UpperCaseLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";

        int upperCase = 0;
        int lowerCase = 0;
        boolean result = false;

        char[] array = str.toCharArray();
        // System.out.println(Arrays.toString(chr1));

        for (char each : array) {
            if (Character.isLowerCase(each)){
                lowerCase++;
            }
            if (Character.isUpperCase(each)){
                upperCase++;
            }

        }
        System.out.println(upperCase == lowerCase);


    }
}
/*
6. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods

 */