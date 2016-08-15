package com.mymusic;

import java.util.List;

/**
 * Created by srijithkarippure on 8/15/16.
 */
public abstract class Player {


    public PlayList tobePlayed;
    public abstract void play();

    public PlayList getTobePlayed() {
        return tobePlayed;
    }

    public void setTobePlayed(PlayList tobePlayed) {
        this.tobePlayed = tobePlayed;
    }
}
