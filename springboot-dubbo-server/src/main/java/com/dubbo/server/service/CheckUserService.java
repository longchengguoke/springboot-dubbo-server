package com.dubbo.server.service;

import com.dubbo.server.entity.UserInfoVo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * @author Mr.C
 * @Description
 * @create 2018/7/26 10:26
 * Copyright: Copyright (c) 2018
 * Company:CWWT
 */
public interface CheckUserService {

    UserInfoVo checkUser(UserInfoVo userInfoVo);

    List<UserInfoVo> checkUser(List<UserInfoVo> userInfoVoList) throws IOException, NoSuchAlgorithmException;
}
