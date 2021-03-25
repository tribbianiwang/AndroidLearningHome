package com.wl.androidlearning.designpattern.adapter;

import android.util.Log;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        Log.d("adapter","mp4:"+fileName+"isplaying");
    }
}
