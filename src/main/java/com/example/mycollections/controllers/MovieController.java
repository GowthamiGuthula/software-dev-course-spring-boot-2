package com.example.mycollections.controllers;

public class MovieController {
    private final List<Movie> movies = new ArrayList<>();   
    public MovieController() {
        movies.add(new Movie("Movie1", "Director1", 1994, 142));
        movies.add(new Movie("Movie2", "Director2", 1972, 175));
        movies.add(new Movie("Movie3", "Director3", 1994, 154));
    }
}   

