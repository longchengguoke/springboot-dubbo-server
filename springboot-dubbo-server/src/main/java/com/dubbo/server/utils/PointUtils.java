package com.dubbo.server.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;

/**
 * @author Mr.C
 * @Description
 * @create 2018/7/26 20:12
 * Copyright: Copyright (c) 2018
 * Company:CWWT
 */
public class PointUtils {

    public static String delPoint(XSSFCell cell){
        String cellValue=String.valueOf(cell);
        if(cellValue.contains(".0")){
            cellValue=cellValue.split("\\.")[0];
        }
        return cellValue;
    }

}
