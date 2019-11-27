package com.sun.action;

/**
 * Created by sun on 2019/10/20.
 **/
public class XyLocation implements Location {

    private int x;

    private int y;

    public XyLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public boolean isExist() {
        return true;
    }
}
