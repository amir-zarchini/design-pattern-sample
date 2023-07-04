package com.company.mediaPlayer;

public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // check format and play file
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("play with mp3 : " + fileName);

            // if file is not support send for adapter
        } else if (audioType.equalsIgnoreCase("vlc" ) || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);

        } else {
            System.out.println("file type not found for " + fileName);
        }
    }
}
