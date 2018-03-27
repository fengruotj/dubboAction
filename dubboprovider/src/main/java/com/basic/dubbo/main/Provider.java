package com.basic.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * locate com.basic.dubbo.main
 * Created by mastertj on 2018/3/27.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        context.start();
        System.in.read();
    }
}
