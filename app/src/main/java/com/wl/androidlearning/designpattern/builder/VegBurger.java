package com.wl.androidlearning.designpattern.builder;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "蔬菜素汉堡";
    }

    @Override
    public float price() {
        return 12f;
    }
}
