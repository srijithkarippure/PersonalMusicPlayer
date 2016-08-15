package com.mymusic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by srijithkarippure on 8/15/16.
 */
public class PlayList {
    private List<Song> playList;
    private int currentSelection;

    public PlayList(){
        setPlayList(new ArrayList<Song>());
        setCurrentSelection(0);
    }

    public List<Song> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Song> playList) {
        this.playList = playList;
    }

    public int getCurrentSelection() {
        return currentSelection;
    }

    public void setCurrentSelection(int currentSelection) {
        this.currentSelection = currentSelection;
    }
}
