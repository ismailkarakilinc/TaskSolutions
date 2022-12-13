package day15_whileLoop;

public class FrequencyOfChar {

    public static void main(String[] args) {


        String inp = "asdbfbdsfbasjdha";

        char character = 'b';

        int count =0;

        for (int i = 0  ; i < inp.length() ; i++){

            if (character == inp.charAt(i)){
                count++;

            }
        }

        System.out.println(count);

    }
}

       /* Scanner input = new Scanner(System.in);

        System.out.println("input: ");

        String inp = input.next();

        System.out.println("Which character? ");

        char character = input.char();

        String result = "";

        for (int i = 0  ; i < inp.length() ; i++){

            if (inp.charAt(i) == character) {
                result += inp.charAt(i);
            }
        }

        System.out.println(result);

    }
}

        */
/*
3. Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the
 frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4


 Scanner input = new Scanner(System.in);

        System.out.println("input: ");

        String inp = input.next();

        String result = "";

        for (int i = 0  ; i < inp.length() ; i++){

            if (result.contains("" + inp.charAt(i))){

                continue;
            }
            result += inp.charAt(i);
        }

        System.out.println(result);

 */
