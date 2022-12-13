package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class BeforeAugust {

    public static void main(String[] args) {

        ArrayList<LocalDate> date = new ArrayList<>(Arrays.asList(LocalDate.of(2022,11,5),
        (LocalDate.of(1995,6,5)),(LocalDate.of(2024,11,8)),(LocalDate.of(1905,2,15))));

        date.removeIf(p-> p.isBefore(LocalDate.of(2016,8,15)));

        System.out.println(date);




    }
}
