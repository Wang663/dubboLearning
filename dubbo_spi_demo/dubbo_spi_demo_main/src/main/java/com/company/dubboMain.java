package com.company;

import com.company.service.HelloService;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.Set;

public class dubboMain {
    public static void main(String[] args) {
        //获取扩展加载器
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);

        Set<String> extensions = extensionLoader.getSupportedExtensions();
        for (String s :extensions ) {
            System.out.println(s);
            HelloService service = extensionLoader.getExtension(s);
            String result = service.HelloService();
            System.out.println(result);
        }
    }
}
