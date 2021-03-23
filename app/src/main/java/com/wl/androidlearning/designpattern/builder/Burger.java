package com.wl.androidlearning.designpattern.builder;

public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }


}
