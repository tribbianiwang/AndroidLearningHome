package com.wl.androidlearning.designpattern.adapter;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
            if("vlc".equals(audioType)){
                advancedMediaPlayer =new VlcPlayer();
            }else if("mp4".equals(audioType)){
                advancedMediaPlayer = new Mp4Player();
            }

    }

    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equals(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        }else if("mp4".equals(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }

    }

}
