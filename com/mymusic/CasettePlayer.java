package com.mymusic;

/**
 * Created by srijithkarippure on 8/15/16.
 */
public class CasettePlayer extends Player{
    private static CasettePlayer c;

    private CasettePlayer(){

    }


    @Override
    public void play() {

        System.out.println("From Casette Player");
        for(Song s : tobePlayed.getPlayList()){
            tobePlayed.setCurrentSelection(tobePlayed.getCurrentSelection()+1);
            s.setPlayed(true);
            s.setCount(s.getCount()+1);
            System.out.println("Current Selection:" + tobePlayed.getCurrentSelection() );
            System.out.println("Playing Song:" + s.getTitle());
            System.out.println("Duration:" + s.getDuration());
        }
    }

    public static CasettePlayer getInstance() {
        if(c == null) c = new CasettePlayer();
        return c;
    }
}
