package com.wl.androidlearning.designpattern.builder;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 4.5f;
    }
}
