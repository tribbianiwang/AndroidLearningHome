package com.wl.androidlearning.designpattern.prototype;

import android.util.Log;

public class Square extends Shape{
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        Log.d("prototype","画个正方形");
    }
}
