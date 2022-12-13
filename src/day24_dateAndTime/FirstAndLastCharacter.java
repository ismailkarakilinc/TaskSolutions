package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastCharacter {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        for (String each : list) {
            if(each.substring(0,1).equalsIgnoreCase(each.substring(each.length()-1))){
                continue;
            }else{
                System.out.print(each+" ");
            }
        }

        System.out.println();

        System.out.println("---------------------------Second Answer-----------------------------");

        list.removeIf(p->p.substring(0,1).equalsIgnoreCase(p.substring(p.length()-1)));
        System.out.println(list);
    }
}
