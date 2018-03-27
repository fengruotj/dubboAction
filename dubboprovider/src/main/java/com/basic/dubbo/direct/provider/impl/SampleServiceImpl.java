package com.basic.dubbo.direct.provider.impl;

import com.basic.dubbo.direct.provider.SampleService;
import com.basic.dubbo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.basic.com.basic.dubbo.direct.provider
 * Created by mastertj on 2018/3/27.
 */
@Service("sampleService")
public class SampleServiceImpl implements SampleService {

    public String sayHello(String name) {
        return "hello~!~!!"+name;
    }

    public List getUsers() {
        List<User> list=new ArrayList<User>();
        User user1 =new User("tanjie",25,"boy");
        User user2 =new User("lizhitao",25,"boy");
        User user3 =new User("zhangfan",25,"boy");
        User user4 =new User("jiehaopeng",25,"boy");
        User user5 =new User("liuchong",25,"boy");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        return list;
    }
}
