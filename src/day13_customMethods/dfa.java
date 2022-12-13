package day13_customMethods;

public class dfa {

    public static void main(String[] args) {

        System.out.println("python python python python");

    }
    public static int FrequencyOfWord(String sentence,String word){
        String sentens =sentence.substring(1);
        int FrequencyOfWord = (sentens.length()-sentens.length())+1;
        return FrequencyOfWord;
    }
}
