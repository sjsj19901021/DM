package com.sun.action;

import com.jacob.com.Variant;
import com.sun.base.EnvConsant;
import com.sun.base.EnvManager;
import com.sun.base.IdmSoft;
import com.sun.base.LocalAmount;
import com.sun.base.Window;

/**
 * Created by sun on 2019/10/20.
 **/
public class PicLocation implements Location {

    private int x;

    private int y;

    private String picPath;


    public PicLocation(String picPath) {
        this.picPath = EnvConsant.ROOT_PATH + picPath;
    }

    public static PicLocation create(String pic) {
        return new PicLocation(pic);
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
        findPic();
        return x != -1 && y != -1;
    }

    private void findPic() {
        LocalAmount localAmount = EnvManager.INSTANCE.get(Thread.currentThread().getName());
        IdmSoft dm = localAmount.getDm();
        Window currentWindow = localAmount.getWindow();
        Variant x = new Variant(0, true);
        Variant y = new Variant(0, true);
        int code = dm.FindPic(0, 0, currentWindow.getX(), currentWindow.getY(), picPath, "000000", EnvConsant.PIC_SIM, 0, x, y);
//        System.out.println("picPath:" + picPath + "  坐标 x:" + x + "y:" + y + "查询状态" + code);
        this.x = x.getInt();
        this.y = y.getInt();
    }
}
