package com.codedifferently.paircodingtdd;

public class Movie {
    private String title;
    private Rating rating;
    private Double ranking;
    private Integer length;

    public  Movie(String title, Rating rating, Double ranking, Integer length) {
        this.title = title;
        this.rating = rating;
        this.ranking = ranking;
        this.length = length;
    }

    public String getTitle() {
        return "Movie: " + title;
    }

    public void setTitle(String title) {

    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
    }

    public Double getRanking() {
        return ranking;
    }

    public void setRanking(Double ranking) {
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
    }




    }
