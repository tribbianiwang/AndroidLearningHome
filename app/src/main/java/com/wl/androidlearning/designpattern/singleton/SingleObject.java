package com.wl.androidlearning.designpattern.singleton;

import android.util.Log;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject  getInstance(){
        return instance;
    }

    public void showMessage(){
        Log.d("singeton","singleobject-message");
    }
}
