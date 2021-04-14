package com.myCampany.impl;

import com.myCampany.api.HelloService;
import org.apache.dubbo.config.annotation.Service;

//dubbo提供的
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello1"+name;
    }
}
