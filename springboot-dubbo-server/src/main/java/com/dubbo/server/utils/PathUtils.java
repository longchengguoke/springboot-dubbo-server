package com.dubbo.server.utils;

import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

/**
 * @author Mr.C
 * @Description
 * @create 2018/7/27 10:28
 * Copyright: Copyright (c) 2018
 * Company:CWWT
 */
public class PathUtils {

    public static String getResourcePath() throws FileNotFoundException {
        return ResourceUtils.getURL("classpath:").getPath();
    }
}
