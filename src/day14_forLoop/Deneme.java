package day14_forLoop;

public class Deneme {

    public static void main(String[] args) {

        String word = "Cucumber";

        boolean starts = true;
        boolean ends = true;

        if (word.charAt(0)=='a'){
            System.out.println("Starts with a: " + starts);
        }else {
            System.out.println("Starts with a: " + !starts);
        }
        if (word.charAt(word.length()-1) == 'e'){
            System.out.println("Ends with e: " + ends);
        }else {
            System.out.println("Ends with e: " + !ends);
        }


    }
}
