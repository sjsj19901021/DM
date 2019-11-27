package com.sun.base;

import java.io.Serializable;

/**
 * Created by sun on 2019/10/19.
 **/
public class LocalAmount implements Serializable {

    /**
     * 窗口绑定的大漠对象
     */
    private IdmSoft dm;

    private User user;

    private Window window;

    public LocalAmount(IdmSoft dm, User user, Window window) {
        this.dm = dm;
        this.user = user;
        this.window = window;
    }

    public IdmSoft getDm() {
        return dm;
    }

    public void setDm(IdmSoft dm) {
        this.dm = dm;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LocalAmount)) return false;
        LocalAmount that = (LocalAmount) o;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        return window != null ? window.equals(that.window) : that.window == null;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (window != null ? window.hashCode() : 0);
        return result;
    }
}
