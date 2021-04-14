package com.company.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

//指定接口的默认实现
@SPI("laowang")
public interface HelloService {
    String HelloService();

    @Adaptive
    String HelloService(URL url);
}
