package com.wl.androidlearning.designpattern.adapter;

import android.util.Log;

public class AudioPlayer implements MediaPlayer{

    public MediaAdapter mediaAdapter;


    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3")){
            Log.d("adapter","mp3:"+fileName+"isplaying");
        }else if(audioType.equals("mp4")||audioType.equals("vlc")){
            mediaAdapter =new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else {
            Log.d("adapter","暂不支持"+audioType);
        }
    }
}
