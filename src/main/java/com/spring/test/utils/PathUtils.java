package com.spring.test.utils;

import javafx.application.Application;

/**
 * Created by mulin on 2017-01-23.
 */
public final class PathUtils {

    public static final String FILE_SEPARATOR = System.getProperty("file.separator");

    public static String GetRoot(Object object) {
        String path = object.getClass().getClassLoader().getResource("../").getPath();
        String realpath = getRealFilePath(path);
        realpath = realpath.substring(1);
        return realpath;
    }

    public static String GetRootSrc(Object object) {
        String path = object.getClass().getClassLoader().getResource("/").getPath();
        String realpath = getRealFilePath(path);
        realpath = realpath.substring(1);
        return realpath;
    }

    public static String getRealFilePath(String path) {
        return path.replace("/", FILE_SEPARATOR).replace("\\", FILE_SEPARATOR);
    }
}
