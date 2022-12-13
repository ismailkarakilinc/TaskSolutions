package day19_Array;

public class Reverstrgas {

    public static void main(String[] args) {

        String[] classmates = new String[10];





        classmates[0] = "Ismail Karakilinc";
        classmates[1] = "Isa Yilmaz";
        classmates[2] = "Bunyamin Yasar";
        classmates[3] = "Furkan Aktas";
        classmates[4] = "Muhammed Oktay";
        classmates[5] = "Murat Kubilay";
        classmates[6] = "Emine Karakilinc";
        classmates[7] = "Fatih Erdemir";
        classmates[8] = "Ebubekir Agirbas";
        classmates[9] = "Yusuf Simsek";



        for (int j = 0; j < classmates.length; j++) {
            String reverse = "";

            for (int i = classmates[j].length()-1;  i >= 0; i--) {

                reverse += classmates[j].charAt(i);

            }
            System.out.println(reverse);
        }


    }
}
