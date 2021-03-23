package com.wl.androidlearning.designpattern.builder;

import java.sql.Wrapper;

public class Bottle implements Packing {
    @Override
    public String packing() {
        return "瓶子";
    }
}
