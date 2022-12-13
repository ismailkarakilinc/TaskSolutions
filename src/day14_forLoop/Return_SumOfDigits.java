package day14_forLoop;

import java.util.Scanner;

public class Return_SumOfDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String:");
        String sentence = input.nextLine();

        int result = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i)>='0'&&sentence.charAt(i)<='9'){
                result += (sentence.charAt(i)-48);
            }
        }
        System.out.println("Sum of digits from a string = "+result);


    }
}