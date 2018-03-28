package com.basic.dubbo.main;

import com.basic.dubbo.dependency.provider.DependencyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * locate com.basic.dubbo.main
 * Created by mastertj on 2018/3/28.
 */
public class DependencyConsumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"dependency-consumer.xml"});
        context.start();
        DependencyService dependencyService= (DependencyService) context.getBean("dependencyService");
        //调用该服务
        String dependecny = dependencyService.dependecny();
        System.out.println(dependecny);
        System.in.read();
    }
}
