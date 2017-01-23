package com.spring.test.utils;

import javafx.application.Application;

/**
 * Created by mulin on 2017-01-23.
 */
public final class PathUtils {

    public static final String FILE_SEPARATOR = System.getProperty("file.separator");

    public static String GetRoot(Object object) {
        String path = object.getClass().getClassLoader().getResource("../").getPath();
        String real_path = getRealFilePath(path);
        real_path = real_path.substring(1);
        return real_path;
    }

    public static String getRealFilePath(String path) {
        return path.replace("/", FILE_SEPARATOR).replace("\\", FILE_SEPARATOR);
    }
}
