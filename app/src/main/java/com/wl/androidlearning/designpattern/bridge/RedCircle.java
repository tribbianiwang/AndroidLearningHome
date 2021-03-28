package com.wl.androidlearning.designpattern.bridge;

import android.util.Log;

public class RedCircle implements DrawApi{

    @Override
    public void drawCircle(int radius, int x, int y) {
        Log.d("bridge","draw a redcircle radius:"+radius+"x:"+x+"y:"+y);
    }
}
