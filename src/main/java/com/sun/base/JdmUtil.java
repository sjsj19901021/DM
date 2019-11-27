package com.sun.base;


import java.lang.reflect.Field;

/**
 * Created by sun on 2019/10/19.
 **/
public class JdmUtil {
    public static void setLibPath() {
        try {
//            String libraryPath = ClassLoader.class.getResource("/dll").getPath();
//            Field userPathsField = ClassLoader.class.getDeclaredField("usr_paths");
//            userPathsField.setAccessible(true);
//            String[] paths = (String[]) userPathsField.get(null);
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < paths.length; i++) {
//                if (libraryPath.equals(paths[i])) {
//                    continue;
//                }
//                sb.append(paths[i]).append(';');
//            }
//            sb.append(libraryPath);
//            System.setProperty("java.library.path", sb.toString());
            System.out.println("java.library.path" + System.getProperty("java.library.path"));
            final Field sysPathsField = ClassLoader.class.getDeclaredField("sys_paths");
            sysPathsField.setAccessible(true);
            sysPathsField.set(null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
