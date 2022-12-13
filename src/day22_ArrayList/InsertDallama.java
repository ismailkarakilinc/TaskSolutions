package day22_ArrayList;

import java.util.Arrays;

public class InsertDallama {

    public static void main(String[] args) {


        String str = "DEXTEREAS oliverldd";

        char[] array = str.toCharArray();

        boolean result = false;
        int countUpper = 0;
        int countLower = 0;

        for (char each : array) {

            if (Character.isUpperCase(each)){
                countUpper++;
            } else if (Character.isLowerCase(each)) {
                countLower++;
            }
        }

        if (countUpper==countLower){
            result=true;
        }

        System.out.println(result);
    }
}

