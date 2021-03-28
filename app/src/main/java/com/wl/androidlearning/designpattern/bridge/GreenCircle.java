package com.wl.androidlearning.designpattern.bridge;


import android.util.Log;

public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        Log.d("bridge","draw a greencircle radius:"+radius+"x:"+x+"y:"+y);
    }
}
