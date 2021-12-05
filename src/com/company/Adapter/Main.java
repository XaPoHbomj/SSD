package com.company.Adapter;

public class Main {

    public static void main(String[] args) {
        PlayerDevice playerDevice = new PlayerDevice();
        MediaAdapter mediaAdapter = new MediaAdapter(playerDevice);
        playerDevice.playMb3();
        playerDevice.playMb4(mediaAdapter);
    }
}
