package com.spring.aop.quickstart;

public class MessagePrinter {
    final private MessageService service;
    public MessagePrinter(MessageService service){
        this.service=service;
    }
    public void printMessage(){
        System.out.print(this.service.getMessage());
    }
}
