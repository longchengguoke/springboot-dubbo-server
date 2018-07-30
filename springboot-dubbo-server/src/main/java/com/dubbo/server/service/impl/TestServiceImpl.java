package com.dubbo.server.service.impl;

import com.dubbo.server.service.TestService;

/**
 * @author Mr.C
 * @Description
 * @create 2018/7/16 17:44
 * Copyright: Copyright (c) 2018
 * Company:CWWT
 */
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
