package com.company.Adapter;

public class MediaAdapter implements MediaPlayer {

    AudioPlayer audioPlayer;

    public MediaAdapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void playMb4() {
        System.out.println("Playing Mb4");
    }
}
