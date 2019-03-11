package com.spring.aop.quickstart.quickstart.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {
    @Value("Tom")
    private String name;

    @Value("20")
    private int age;

    @Autowired
    private Phone phone;
}