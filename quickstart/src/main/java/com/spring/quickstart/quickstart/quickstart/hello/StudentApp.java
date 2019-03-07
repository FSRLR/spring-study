package com.spring.quickstart.quickstart.quickstart.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {
        //读入XML文件
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
        //读取配置好的beans
        Student student= (Student) context.getBean("student");
        System.out.print(student);
    }
}
