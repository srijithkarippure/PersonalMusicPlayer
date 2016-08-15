package com.mymusic;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by srijithkarippure on 8/15/16.
 */
public class START {

    public static void main(String[] args){
        Artist a1 = new Artist("JohnLegend",25);
        Song s1 = new Song("Take me Away",a1,3.15d,Genre.CLASSIC);

        Artist a2 = new Artist("SamSmith",25);
        Song s2 = new Song("Lay Me Down",a1,3.15d,Genre.SOULFUL);

        Player casettePlayer = PlayerFactory.getPlayer("Cassette");
        System.out.print("C"+casettePlayer);

        PlayList playList = new PlayList();
        List<Song> songsTobePlayed = new ArrayList<Song>();
        songsTobePlayed.add(s1);
        songsTobePlayed.add(s2);
        playList.setPlayList(songsTobePlayed);
        casettePlayer.setTobePlayed(playList);
        casettePlayer.play();

    }
}

