package com.sun.service.core;

import com.jacob.com.Variant;
import com.sun.base.DMSoftFactory;
import com.sun.base.EnvManager;
import com.sun.base.IdmSoft;
import com.sun.base.JdmUtil;
import com.sun.base.LocalAmount;
import com.sun.base.User;
import com.sun.base.Window;
import com.sun.exception.DmException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by sun on 2019/10/20.
 **/
public class EnvServiceImpl implements EnvService {
    private static final String corePath = "/core.properties";
    private static final String userPath = "/user.properties";

    @Override
    public List<LocalAmount> config() {
        List<LocalAmount> localAmounts = new ArrayList<>();
        try {
            JdmUtil.setLibPath();
            Properties properties = new Properties();
            properties.load(EnvServiceImpl.class.getResourceAsStream(corePath));
            String dmID = properties.getProperty("dmID");
            IdmSoft dmsoft = registerDM(dmID);
            String windows = dmsoft.EnumWindow(0, properties.getProperty("gameName"), "", 1);
            String[] windowIds = windows.split(",");
            List<User> users = loadUserInfo();
            for (int i = 0; i < windowIds.length; i++) {
                String windowId = windowIds[i];
                IdmSoft dm = registerDM(dmID);
                int code = dm.BindWindow(Integer.valueOf(windowId), "dx", "windows3", "windows", 101);
//                dm.SetWindowText(Integer.valueOf(windowId), "测试");
                if (code == 1) {
                    Variant x = new Variant(0, true);
                    Variant y = new Variant(0, true);
                    dm.GetClientSize(Integer.valueOf(windowId), x, y);
                    LocalAmount localAmount = new LocalAmount(dm, users.get(i), new Window(windowId, x.getInt(), y.getInt()));
//                    EnvManager.INSTANCE.put(Thread.currentThread().getName(), localAmount);
                    localAmounts.add(localAmount);
                    //************************************************************************
                    dm.delay(80);
                    dm.SetMouseDelay("windows", 40);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return localAmounts;
        }
        return localAmounts;
    }

    private List<User> loadUserInfo() throws IOException {
        Properties properties = new Properties();
        InputStream inStream = getResource();
        properties.load(inStream);
        String prefix = "user";
        List<User> users = new ArrayList<>();
        int i = 1;
        while (true) {
            String userName = properties.getProperty(prefix + i + ".userName");
            if (userName == null || userName.equals("")) {
                break;
            }
            String password = properties.getProperty(prefix + i + ".password");
            String nickname = properties.getProperty(prefix + i + ".nickname");
            users.add(new User(userName, password, nickname));
            i++;
        }
        return users;
    }

    private InputStream getResource() {
        String property = System.getProperty("user.dir");
        String outPath = property + "/user.properties";
        System.out.println("outPath" + outPath);
        InputStream outConfig = EnvServiceImpl.class.getResourceAsStream(outPath);
        try {
            if (outConfig == null || outConfig.available() < 10) {
                InputStream stream = EnvServiceImpl.class.getResourceAsStream(userPath);
                return stream;
            }
        } catch (Exception e) {
            throw new RuntimeException("读取user.properties配置错误");
        }
        return outConfig;
    }

    private IdmSoft registerDM(String dmID) {
        IdmSoft dmsoft = DMSoftFactory.getInstance().getSoft();
        int code = dmsoft.Reg(dmID, "");
        if (code != 1) {
            throw new DmException("插件注册失败");
        }
        return dmsoft;
    }
}
