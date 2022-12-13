package day18_MemoryManagement;

public class Character {

    public static void main(String[] args) {


        String str = "aaabbccccddeeee";

        int result = 0;
        char character ;
        char character2;

        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length() ; j++) {
                if (str.charAt(j) == character){
                    result++ ;
                }
            }
            if (count >= result ){
                result = count;
            }

        }
        System.out.println(result);


    }

}



/*
1. Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
 */



