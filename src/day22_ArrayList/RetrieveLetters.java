package day22_ArrayList;

import java.util.Arrays;

public class RetrieveLetters {

    public static void main(String[] args) {

        String str = "Wooden 23 @Spoon!";

        String letters = "";
        String digits = "";
        String specialChars = "";

        char[] chr1 = str.toCharArray();
       // System.out.println(Arrays.toString(chr1));

        for (char each : chr1) {
            if (Character.isDigit(each)){
                digits += Integer.parseInt(""+each);
            } else if (!Character.isLetterOrDigit(each)){
                specialChars += each;
            }else {
                letters += each;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars.replace(" ",""));

    }
}
/*
5. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods
 */
