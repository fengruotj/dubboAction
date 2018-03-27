package com.basic.dubbo.main;

import com.basic.dubbo.direct.provider.SampleService;
import com.basic.dubbo.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * locate com.basic.dubbo.main
 * Created by mastertj on 2018/3/27.
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        context.start();
        SampleService service= (SampleService) context.getBean("sampleService");
        List<User> users = service.getUsers();
        for (User user : users) {
            System.out.println(user);
        }

        System.in.read();
    }
}
