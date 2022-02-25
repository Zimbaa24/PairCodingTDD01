package com.codedifferently.paircodingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void constructor01() {
        Movie movie = new Movie("Cruel Intentions", Rating.R, 4.5, 147);
        String expected = "Movie: Cruel Intentions";
        String actual = movie.getTitle();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTitleTest() {
        Movie movie = new Movie("Cruel Intentions", Rating.R, 4.5, 147);
        String expected = "Movie: Cruel Intentions";
        String actual = movie.getTitle();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getRatingTest() {
        Movie movie = new Movie("Cruel Intentions", Rating.R, 4.5, 147);
        String expected = String.valueOf(Rating.R);
        String actual = String.valueOf(movie.getRating());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getRankingTest() {
        Movie movie = new Movie("Cruel Intentions", Rating.R, 4.5, 147);
        String expected = String.valueOf(4.5);
        String actual = String.valueOf(movie.getRanking());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getLengthTest() {
        Movie movie = new Movie("Cruel Intentions", Rating.R, 4.5, 147);
        String expected = String.valueOf(147);
        String actual = String.valueOf(movie.getLength());
        Assertions.assertEquals(expected, actual);
    }
}