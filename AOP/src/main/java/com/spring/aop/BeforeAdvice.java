package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeforeAdvice {
    private static final Logger logger= LoggerFactory.getLogger(UserDao.class);
    //定义前置方法
    public void beforeMethod(){
        logger.info("连接数据库。。。");
    }
}
