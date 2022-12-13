package day06_ifStatements;

public class CharacterIdentity {
    public static void main(String[] args) {

        /*

        5. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

            Ex:
                ch = '@'

            output:
                Special Character


                ch = '1'

            output:
                digit

            HINT: You may wanna check out the numbers of the chracters on ASCII table

         */

       char b = '{';

       if (b>32 && b<48 || b>57 && b<65 || b>132 && b<97 || b>122 && b<127){
           System.out.println("Special Character");
       }
       if (b>46 && b<58){
           System.out.println("Digit");
       }
       if (b>64 && b<91 || b>96 && b<123){
           System.out.println("Alphabetic Character");
       }

    }
}
