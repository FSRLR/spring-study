package com.spring.aop;

public class Tankproxy implements Move{
    private Move t;
    public Tankproxy(Move t){
        this.t=t;
    }
    @Override
    public void move() {
        System.out.println("Starting");
        t.move();
        System.out.println("stop");
    }
}
