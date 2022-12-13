package day21_MultiDimensionalArray;

import java.util.Arrays;

public class Rvers {

    public static void main(String[] args) {

       int[] number = {1, 23, 45, 656, 7, 4, 3, 2, 3, 6, 6};

       String resultEven = "";
       String resultOdd = "";

        for (int each : number) {

            if (each % 2 == 0 ){
                resultEven += each + ",";
            }else {
                resultOdd += each + ",";
            }

        }
        resultEven = resultEven.substring(0,resultEven.length()-1);
        resultOdd = resultOdd.substring(0,resultOdd.length()-1);
        System.out.println("Even numbers are: " + resultEven);
        System.out.println("Odd numbers are: " + resultOdd);
    }
}
