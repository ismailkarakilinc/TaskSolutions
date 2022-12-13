package day20_ForEach;

public class Palindromes {

    public static void main(String[] args) {

        String[] sentence = {"anna", "level", "Java", "Mahmut"};

        String reverse = "";

        int count = 0;

        for (int i = 0 ; i< sentence.length; i++ ) {
            reverse = "";
            for (int j = sentence[i].length()-1 ; j >= 0 ; j--){
                reverse += sentence[i].charAt(j);
            }
            if (reverse.equals(sentence[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
