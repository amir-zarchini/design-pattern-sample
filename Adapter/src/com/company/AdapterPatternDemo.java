package com.company;

import com.company.mediaPlayer.AudioPlayer;

public class AdapterPatternDemo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "x.mp3");
        audioPlayer.play("mp4", "y.mp4");
        audioPlayer.play("vlc", "z.vlc");
        audioPlayer.play("ogg", "w.ogg");
    }
}
