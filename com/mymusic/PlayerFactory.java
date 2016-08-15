package com.mymusic;

/**
 * Created by srijithkarippure on 8/15/16.
 */
public class PlayerFactory {

    public static Player getPlayer(String playerType){
        if(playerType.equals("CD")){
            return MusicPlayer.getInstance();
        }
        else if(playerType.equals("Cassette")){
            return CasettePlayer.getInstance();
        }
        return null;
    }
}
