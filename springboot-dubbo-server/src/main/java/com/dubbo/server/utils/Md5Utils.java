package com.dubbo.server.utils;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Mr.C
 * @Description
 * @create 2018/7/26 9:56
 * Copyright: Copyright (c) 2018
 * Company:CWWT
 */
public class Md5Utils {

    public static String  encodeByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md5=MessageDigest.getInstance("MD5");
        BASE64Encoder base64 = new BASE64Encoder();
        String newStr = base64.encode(md5.digest(str.getBytes("UTF-8")));
        return newStr;
    }
}
