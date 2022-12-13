package day28_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyShop {

    public static void main(String[] args) {

        ArrayList<Candy> list = new ArrayList<>(Arrays.asList());
        Candy candy1 = new Candy("Elit",16,12.5,false);
        Candy candy2 = new Candy("Napoliten",5,3,true);

        list.addAll(Arrays.asList(candy1,candy2));
        System.out.println(candy1);

        for (Candy each : list) {
            System.out.println(each.getPrice());
            System.out.println(each.getBrand());
        }
        System.out.println(list);
    }
}
