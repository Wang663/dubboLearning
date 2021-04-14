package com.company.service.impl;

import com.company.service.HelloService;
import org.apache.dubbo.common.URL;

public class humanHelloService implements HelloService {
    public String HelloService() {
        return "hello 你好";
    }

    public String HelloService(URL url) {
        return "people url";
    }
}
