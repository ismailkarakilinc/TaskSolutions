package day25_constructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country ;
    public String title;
    public String director;
    public LocalDate releaseDate;

    ArrayList<String> cast = new ArrayList<>();
    ArrayList<String> genre = new ArrayList<>();

    public Movie(String country, String title, String director, LocalDate releaseDate) {
        this.country = country;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public void addCast(String[] castName){
        cast.addAll(Arrays.asList(castName));
    }
    public void setGenre(String[] genreName){
        genre.addAll(Arrays.asList(genreName));
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", cast=" + cast +
                ", genre=" + genre +
                '}';
    }
}
/*
Task04:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie

 */
