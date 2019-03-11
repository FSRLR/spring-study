package com.spring.image;

import com.spring.aop.Tiger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ImageCopyApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ImageCopy imageCopy=context.getBean(ImageCopy.class);
        try {
            imageCopy.copyImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
