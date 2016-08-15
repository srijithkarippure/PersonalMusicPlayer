package com.mymusic;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by srijithkarippure on 8/15/16.
 */
public class Album {
    private List<Song> album;
    private String title;

    public Album(){
        setAlbum(new ArrayList<Song>());
    }

    public List<Song> getAlbum() {
        return album;
    }

    public void setAlbum(List<Song> album) {
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
