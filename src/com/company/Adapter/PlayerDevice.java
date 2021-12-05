package com.company.Adapter;

public class PlayerDevice implements AudioPlayer {

    public void playMb4(MediaPlayer mediaPlayer) {
        mediaPlayer.playMb4();
    }

    @Override
    public void playMb3() {
        System.out.println("Playing Mb3");
    }
}
