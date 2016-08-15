package com.mymusic;

/**
 * Created by srijithkarippure on 8/15/16.
 */
public class MusicPlayer extends Player{
    //private PlayList tobePlayed;

    private static MusicPlayer musicPlayer = new MusicPlayer();

    public static MusicPlayer getInstance() {
        return musicPlayer;
    }

    private MusicPlayer() {
        //cannot instantiate this class from the outside world.
    }

    public void readDisc(){
        //Reads the Disc and populates the songs that need to be played into the playList.
    }

    public void play(){
        for(Song s : tobePlayed.getPlayList()){
            tobePlayed.setCurrentSelection(tobePlayed.getCurrentSelection()+1);
            s.setPlayed(true);
            s.setCount(s.getCount()+1);
            System.out.println("Current Selection:" + tobePlayed.getCurrentSelection() );
            System.out.println("Playing Song:" + s.getTitle());
            System.out.println("Duration:" + s.getDuration());
        }
    }


}
