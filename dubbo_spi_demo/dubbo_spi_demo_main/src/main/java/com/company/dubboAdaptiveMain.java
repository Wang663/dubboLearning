package com.company;

import com.company.service.HelloService;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class dubboAdaptiveMain {
    public static void main(String[] args) {
        //=key的值
        //test://localhost/hello?hello.service=human
        //如果没有指定key那么就需要spi注解中指定默认的key
        URL url = URL.valueOf("test://localhost/hello");
        HelloService adaptiveExtension = ExtensionLoader.getExtensionLoader(HelloService.class).getAdaptiveExtension();
        String s = adaptiveExtension.HelloService(url);
        System.out.println(s);


    }
}
