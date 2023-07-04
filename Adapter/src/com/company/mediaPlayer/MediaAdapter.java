package com.company.mediaPlayer;

import com.company.advanceMediaPlayer.AdvanceMediaPlayer;
import com.company.advanceMediaPlayer.Mp4Player;
import com.company.advanceMediaPlayer.VlcPlayer;

public class MediaAdapter implements MediaPlayer{

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {

        // check file format and create new instance according to format
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }

    // call play method for vlc or mp4
    @Override
    public void play(String audioType, String fileName) {
         if (audioType.equalsIgnoreCase("vlc")) {
             advanceMediaPlayer.vlcPlay(fileName);
         } else if (audioType.equalsIgnoreCase("mp4")) {
             advanceMediaPlayer.mp4Play(fileName);
        }
    }
}
