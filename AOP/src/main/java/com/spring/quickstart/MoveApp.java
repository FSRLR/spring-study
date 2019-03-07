package com.spring.quickstart;

public class MoveApp {
    public static void main(String[] args) {
        Tank tank=new Tank();
        Move t2=new Tank();
        Move moveProxy=new Tankproxy(tank);
        moveProxy.move();
    }
}
