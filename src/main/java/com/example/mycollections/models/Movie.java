package com.example.mycollections.models;

public class Movie {
    private String name;
    private String director;
    private int year;
    private int runtime;

    public Movie(String name, String director, int year, int runtime) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.runtime = runtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}
