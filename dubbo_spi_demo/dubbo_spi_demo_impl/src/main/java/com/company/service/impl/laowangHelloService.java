package com.company.service.impl;

import com.company.service.HelloService;
import org.apache.dubbo.common.URL;

public class laowangHelloService implements HelloService {

    public String HelloService() {
        return "老王你好";
    }

    public String HelloService(URL url) {
        return "laowang url";
    }
}
