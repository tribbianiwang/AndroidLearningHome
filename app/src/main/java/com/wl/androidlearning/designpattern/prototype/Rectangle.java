package com.wl.androidlearning.designpattern.prototype;

import android.graphics.Rect;
import android.util.Log;

public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        Log.d("prototype","画个长方形");
    }
}
