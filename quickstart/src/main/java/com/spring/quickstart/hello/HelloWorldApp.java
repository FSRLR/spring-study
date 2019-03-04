package com.spring.quickstart.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {
    public static void main(String[] args){
        //读入XML文件
        ApplicationContext context=new ClassPathXmlApplicationContext("/beans.xml");
        //读取配置好的beans
        HelloWorld helloWorld= (HelloWorld) context.getBean("helloWorld");
        //运行方法
        System.out.print(helloWorld.getHello());



    }
}
