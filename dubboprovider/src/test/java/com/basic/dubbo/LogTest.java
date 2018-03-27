package com.basic.dubbo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * locate com.basic.dubbo
 * Created by mastertj on 2018/3/27.
 */
public class LogTest {
    private Logger logger= LoggerFactory.getLogger(LogTest.class);

    @Test
    public void test(){
        logger.info("test");
    }
}
