package com.wl.androidlearning.designpattern.prototype;

public abstract class Shape implements Cloneable{
    private String id;

    protected String type;

    public abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone(){
        Object object = null;
        try {
            object = super.clone();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return object;

    }
}