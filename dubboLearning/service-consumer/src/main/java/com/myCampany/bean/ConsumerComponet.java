package com.myCampany.bean;

import com.myCampany.api.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

//spring中的组件扫描
@Component
public class ConsumerComponet {
    @Reference
    //引用dubbo的组件
    private HelloService helloService;

    public String hello(String name){
        return helloService.sayHello(name);
    }
}
