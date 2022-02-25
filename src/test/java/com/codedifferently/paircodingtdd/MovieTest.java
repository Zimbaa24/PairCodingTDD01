package com.codedifferently.paircodingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {


    @Test
    public void constuctorTest01() {
        Movie movie = new Movie("Nova", Rating.R, 25.0, 200);
        String expected = "Movie: Nova, Rating: R, Ranking: 25.0, Length: 200";
        String actual = movie.toString();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getTitleTest(){
        Movie movie = new Movie("Static Shock ", Rating.R, 13.0, 120);
        String expected = "Static Shock ";
        String actual = movie.getTitle();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setTitleTest(){
        Movie movie = new Movie("Nova", Rating.R, 25.0, 200);
        String expected = "Nova Prime";
        movie.setTitle("Nova Prime");
        String actual = movie.getTitle();
        Assertions.assertEquals(expected, actual);
    }




    @Test
    public void getLengthTest() {
        Movie movie = new Movie("Cruel Intentions", Rating.R, 4.5, 147);
        String expected = String.valueOf(147);
        String actual = String.valueOf(movie.getLength());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setLengthTest() {
        Movie movie = new Movie("Cruel Intentions", Rating.R, 4.5, 147);
        Integer expected = 133;
        movie.setLength(133);
        Integer actual = movie.getLength();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getRatingTest(){
        Movie movie = new Movie("Nova", Rating.PG_13, 25.0, 200);
        Rating expected = Rating.PG_13;
        Rating actual = movie.getRating();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRatingTest(){
        Movie movie = new Movie("Nova", Rating.R, 25.0, 200);
        Rating expected = Rating.PG_13 ;
        movie.setRating(Rating.PG_13);
        Rating actual = movie.getRating();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getRankingTest(){
        Movie movie = new Movie("Nova", Rating.R, 25.0, 200);
        Double expected =  25.0;
        Double actual = movie.getRanking();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRankingTest(){
        Movie movie = new Movie("Nova", Rating.R, 25.0, 200);
        Double expected = 30.0;
        movie.setRanking(30.0);
        Double actual = movie.getRanking();
        Assertions.assertEquals(expected, actual);

    }


}
