package com.wl.androidlearning.designpattern.bridge;

public class Circle extends Shape{
    private int radius,x,y;

    public Circle(DrawApi drawApi,int radius,int x,int y) {
        super(drawApi);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        this.drawApi.drawCircle(radius,x,y);
    }
}
