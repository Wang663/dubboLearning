package com.myCampany;

import com.myCampany.bean.ConsumerComponet;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sound.midi.Track;
import java.io.IOException;

public class AnnotationConsumerMain {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();

        ConsumerComponet service = context.getBean(ConsumerComponet.class);

        while (true){
            System.in.read();
            String msg = service.hello("wang");
            System.out.println(msg);
        }
    }

    @Configuration
    @PropertySource("classpath:/dubbo-consumer.properties")
    //Spring组件加载
    @ComponentScan(basePackages = "com.myCampany.bean")

    @EnableDubbo
    static class ConsumerConfiguration{

    }
}
