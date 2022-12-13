package day13_customMethods;

import java.util.Scanner;

public class FrequencyOfWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please write a sentence: ");

        String sentence = input.nextLine();

        System.out.print("What is the repeading word?: " );

        String word = input.next();

        System.out.println(frequencyOfWord(sentence,word));

        input.close();

    }

    public static int frequencyOfWord (String sentence, String word){

        int sentenceLength = sentence.length();  //14
        int wordLength = word.length();  //4
        sentence =  sentence.toLowerCase().replace(word.toLowerCase(),"");
        int result = sentenceLength-sentence.length();
        result = result/wordLength;
        return result;

    }
}
/*
6. Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
 */
