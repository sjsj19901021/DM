package com.sun.utils;

/**
 * Created by sun on 2019/12/31.
 **/
public class StringUtils {

    public static boolean isEmpty(String str) {
        if (str == null) {
            return true;
        }
        if (str.equals("")) {
            return true;
        }
        return false;
    }
}
