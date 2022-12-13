package day25_constructor;

import java.time.LocalDate;
import java.util.Arrays;

public class TestMovieObject {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA","Java Developer: Zero to Hero","Kuzat Altay", LocalDate.of(2021,4,18));

        movie1.addCast(new String[]{"Ozzy","Ali","Muhtar","Ismail","Raffi","Rudi","Fatih","Baki"});
        movie1.setGenre(new String[]{"Adventure","Comedy","Thriller"});

        System.out.println(movie1);
    }
}
