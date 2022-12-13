package day19_Array;

public class Classmates {

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

        for (int i = 0 ; i < classmates.length ; i++){

            String firstLetterOfFirstName = classmates[i].substring(0,1);

            String surname = classmates[i].substring(classmates[i].indexOf(' '));

            String firstLetterOfSurname = surname.substring(1,2);

            System.out.println(firstLetterOfFirstName + "." + firstLetterOfSurname + ".");
        }

    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */
