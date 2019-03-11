package com.spring.aop.quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MeetingDemo {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("meeting.xml");
        Meeting meeting=context.getBean(Meeting.class);
        System.out.print(meeting);
    }
}
