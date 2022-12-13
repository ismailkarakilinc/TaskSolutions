package day06_ifStatements;

public class NumberToWord {

    public static void main(String[] args) {

        /*
        2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
         */

        int number = 10;
        String result = "";

        if (number==1){
            result="One";
        }
        if (number==2){
            result="Two";
        }
        if (number==3){
            result="Three";
        }
        if (number==4){
            result="Four";
        }
        if (number==5){
            result="Five";
        }
        if (number==6){
            result="Six";
        }
        if (number==7){
            result="Seven";
        }
        if (number==8){
            result="Eight";
        }
        if (number==9){
            result="Nine";
        }
        if (number==10){
            result="Ten";
        }
        System.out.println(result);

    }
}
