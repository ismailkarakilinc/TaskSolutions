package day15_whileLoop;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String str = input.nextLine();

        String result = "";
        char chr ;

        for (int i = 0 ; i<str.length();i++){
            chr = str.charAt(i);

            if (str.indexOf(chr) == str.lastIndexOf(chr)){
                result += chr;
            }

        }
        System.out.println(result);
    }
}
