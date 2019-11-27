package com.sun.base;

import java.io.Serializable;

/**
 * Created by sun on 2019/10/19.
 **/
public class Window implements Serializable {

    private String windowId;

    private int x;

    private int y;

    public Window(String windowId, int x, int y) {
        this.windowId = windowId;
        this.x = x;
        this.y = y;
    }

    public String getWindowId() {
        return windowId;
    }

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Window)) return false;

        Window window = (Window) o;

        if (x != window.x) return false;
        if (y != window.y) return false;
        return windowId != null ? windowId.equals(window.windowId) : window.windowId == null;
    }

    @Override
    public int hashCode() {
        int result = windowId != null ? windowId.hashCode() : 0;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}
