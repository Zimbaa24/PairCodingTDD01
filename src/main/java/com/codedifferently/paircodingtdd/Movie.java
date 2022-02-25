package com.codedifferently.paircodingtdd;

public class Movie {
    private String title;
    private Rating rating;
    private Double ranking;
    private Integer length;


    public Movie(String title, Rating rating, Double ranking, Integer length) {
        this.title = title;
        this.rating = rating;
        this.ranking = ranking;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

        public Rating getRating () {
            return rating;
        }

        public void setRating (Rating rating){
            this.rating = rating;
        }

        public Double getRanking () {
            return ranking;
        }

        public void setRanking (Double ranking){
            this.ranking = ranking;
        }

        public Integer getLength () {
            return length;
        }

        public void setLength (Integer length){
            this.length = length;
        }

        public String toString () {
            return "Movie: " + title + ", Rating: " + rating + ", Ranking: " + ranking + ", Length: " + length;

        }


    }
