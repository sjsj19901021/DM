package com.sun.service.business.rubbish;

import com.sun.action.DelayExecutor;
import com.sun.action.ExecutorBuilder;
import com.sun.action.LeftClickExecutor;
import com.sun.action.Location;
import com.sun.action.PicLocation;
import com.sun.action.XyLocation;
import com.sun.service.core.BaseService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sun on 2019/10/21.
 **/
public class GiveUpRubbishService extends BaseService {
    @Override
    protected boolean invoke() {
        new ExecutorBuilder()
                //打开包裹
                .begin(() -> new LeftClickExecutor().apply(new PicLocation("ui\\package.bmp")))
                //整理
                .link(() -> new LeftClickExecutor().apply(new PicLocation("ui\\order.bmp")))
                .link(() -> new LeftClickExecutor().apply(new PicLocation("ui\\packageName.bmp")))
                .build().get();
        findPage(new String[]{"ui\\2.bmp", "ui\\3.bmp"});
        return false;
    }

    private void findPage(String[] pagePaths) {
        Arrays.stream(pagePaths).forEach(pagePath -> {
            new ExecutorBuilder()
                    .begin(() -> new LeftClickExecutor().apply(new PicLocation(pagePath)))
                    .begin(() -> new DelayExecutor().apply(null))
                    .end(() -> giveUp())
                    .build()
                    .get();
        });
    }


    private Boolean giveUp() {
        int rubbishSize = 10;
        String[] rubbishPaths = new String[rubbishSize];
        for (int i = 0; i < rubbishSize; i++) {
            rubbishPaths[i] = "rubbish\\" + (i + 1) + ".bmp";
        }
        List<Location> rubbishLocations = getRubbishLocation(rubbishPaths);
        rubbishLocations.stream().forEach(this::giveUpAction);
        return true;
    }

    private List<Location> getRubbishLocation(String[] paths) {
        List<Location> rubbishLocation = new ArrayList<>();
        for (String path : paths) {
            PicLocation location = new PicLocation(path);
            if (location.isExist()) {
                rubbishLocation.add(location);
            }
        }
        return rubbishLocation;
    }

    /**
     * 丢弃物品
     *
     * @param location
     */

    private void giveUpAction(Location location) {
        new ExecutorBuilder().begin(() -> new LeftClickExecutor().apply(location))
                .link(() -> new LeftClickExecutor().apply(new XyLocation(83, 280)))
                .link(() -> new DelayExecutor().apply(null))
                .link(() -> new LeftClickExecutor().apply(new PicLocation("ui\\yes.bmp")))
                .link(() -> new DelayExecutor().apply(null))
                .build().get();
    }

    @Override
    public String getServiceName() {
        return "丢弃垃圾";
    }
}
