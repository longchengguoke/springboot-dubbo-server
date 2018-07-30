package com.dubbo.server.service.impl;

import com.dubbo.server.entity.UserInfo;
import com.dubbo.server.entity.UserInfoVo;
import com.dubbo.server.service.CheckUserService;
import com.dubbo.server.utils.Md5Utils;
import com.dubbo.server.utils.PathUtils;
import com.dubbo.server.utils.PointUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * @author Mr.C
 * @Description
 * @create 2018/7/26 10:28
 * Copyright: Copyright (c) 2018
 * Company:CWWT
 */
public class CheckUserServiceImpl implements CheckUserService {

    @Override
    public UserInfoVo checkUser(UserInfoVo userInfoVo) {
        return null;
    }

    @Override
    public List<UserInfoVo> checkUser(List<UserInfoVo> userInfoVoList) throws IOException, NoSuchAlgorithmException {
        //1、读取excel中的用户信息
        FileInputStream in = new FileInputStream( PathUtils.getResourcePath().concat("calfile/userINfo.xlsx"));
        XSSFWorkbook wb=new XSSFWorkbook(in);
        XSSFSheet sheet = wb.getSheetAt(1);

        int num=sheet.getLastRowNum();
        for(int i=1;i<=num;i++){

            UserInfo userInfo=new UserInfo();

            XSSFRow row = sheet.getRow(i);

            int index=0;
            userInfo.setId(PointUtils.delPoint(row.getCell(index)));
            userInfo.setUserId(PointUtils.delPoint(row.getCell(++index)));
            userInfo.setUserName(PointUtils.delPoint(row.getCell(++index)));
            userInfo.setPassword(PointUtils.delPoint(row.getCell(++index)));
            userInfo.setSex(PointUtils.delPoint(row.getCell(++index)));
            userInfo.setAge(Integer.valueOf(PointUtils.delPoint(row.getCell(++index))));
            userInfo.setPhoneNo(Long.valueOf(PointUtils.delPoint(row.getCell(++index))));


            //对用户进行验证
            for(UserInfoVo userInfoVo:userInfoVoList){
                if(userInfo.getId().equals(userInfoVo.getId())){
                    if(userInfoVo.getMd5UserInfo().equals(Md5Utils.encodeByMd5(userInfo.toString()))){
                        userInfoVo.setEnableUser(true);
                    }else{
                        userInfoVo.setEnableUser(false);
                    }
                }
            }
        }
        return userInfoVoList;
    }
}
