package com.wl.androidlearning.designpattern.prototype;

import android.util.Log;

import com.wl.androidlearning.designpattern.prototype.Shape;

public class Circle extends Shape {

     public Circle(){
         type = "circle";
     }

    @Override
    public void draw() {
        Log.d("prototype","画个圆圈");
    }
}
