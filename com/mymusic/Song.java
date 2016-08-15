package com.mymusic;

/**
 * Created by srijithkarippure on 8/15/16.
 */
public class Song {
    private String title;
    private Artist artist;
    //private Album album;
    private Genre genre;
    private double duration;
    private int count;

    public boolean isPlayed() {
        return isPlayed;
    }

    public void setPlayed(boolean played) {
        isPlayed = played;
    }

    private boolean isPlayed;

    public Song(String title,Artist artist, double duration, Genre genre){
        this.duration = duration;
        this.artist = artist;
        this.genre = genre;
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
