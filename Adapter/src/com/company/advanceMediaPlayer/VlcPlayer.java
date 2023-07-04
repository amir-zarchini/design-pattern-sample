package com.company.advanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer {

    @Override
    public void vlcPlay(String fileName) {
        System.out.println("play with vlc format : " + fileName);
    }

    @Override
    public void mp4Play(String fileName) {
        // no body
    }
}
