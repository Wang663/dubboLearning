package com.lagou;

import com.lagou.service.HelloService;


/**
 * mock方法，当超时时会被调用
 */
public class BarServiceMock implements HelloService {
    @Override
    public String sayHello(String name) {
        return "sorry";
    }
}
