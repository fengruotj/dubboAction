package com.basic.dubbo.dependency.provider.impl;

import com.basic.dubbo.dependency.provider.DependencyService;
import com.basic.dubbo.direct.provider.SampleService;
import com.basic.dubbo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * locate com.basic.dubbo.dependency
 * Created by mastertj on 2018/3/28.
 */
@Service("dependencyService")
public class DependencyServiceImpl implements DependencyService {

    //注入SampleService
    @Autowired
    private SampleService sampleService;

    public String dependecny() {
        List<User> users = sampleService.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("dependency exec");
        return "dependency exec";
    }
}
