package com.sun.action;

import com.sun.base.EnvConsant;

/**
 * Created by sun on 2019/10/20.
 **/
public class LeftClickExecutor extends AbstractExecutor {

    /**
     * 如果clickLocation为空，则点击invoke的Location否则点击clickLocation
     */
    private Location clickLocation;


    public LeftClickExecutor(Location clickLocation) {
        this.clickLocation = clickLocation;
    }

    public LeftClickExecutor() {
    }

    @Override
    public Boolean invoke(Location location) {
        if (clickLocation != null) {
            if (!clickLocation.isExist()) {
                return false;
            }
        }
        int x = clickLocation == null ? location.getX() : clickLocation.getX();
        int y = clickLocation == null ? location.getY() : clickLocation.getY();
        int moveTo = dm.MoveTo(x, y);
        if (moveTo == 1) {
            sleep(EnvConsant.DELAY);
            int leftClick = dm.LeftClick();
            if (leftClick == 1) {
                return true;
            }
        }
        return false;
    }


}
