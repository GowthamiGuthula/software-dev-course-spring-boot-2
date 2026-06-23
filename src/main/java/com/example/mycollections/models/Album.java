package com.example.mycollections.models;

public class Album {
    private String name;
    private String artist;
    private int year;
    private int tracks;

    public Album(String name, String artist, int year, int tracks) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }
}
