package com.company.advanceMediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void vlcPlay(String fileName) {
        // no body
    }

    @Override
    public void mp4Play(String fileName) {
        System.out.println("play with mp4 format : " + fileName);
    }
}
