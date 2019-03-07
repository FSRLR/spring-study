package com.spring.quickstart.quickstart;

public class MessageSeriviceImpl implements MessageService{
    private String username;
    private int age;

    public MessageSeriviceImpl(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String getMessage() {
        return "Hello World "+username+",age is "+age;
    }
}
