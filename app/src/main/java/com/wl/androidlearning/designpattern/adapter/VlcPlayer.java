package com.wl.androidlearning.designpattern.adapter;

import android.util.Log;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        Log.d("adapter","vlc:"+fileName+"isplaying");
    }

    @Override
    public void playMp4(String fileName) {

    }
}
