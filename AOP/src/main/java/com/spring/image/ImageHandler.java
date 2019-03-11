package com.spring.image;

import cn.hutool.core.util.ImageUtil;
import com.spring.image.ImageCopy;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

@Aspect
public class ImageHandler {
    private static final Logger logger = LoggerFactory.getLogger(ImageCopy.class);

    @Pointcut("execution(* com.spring.image.ImageCopy.copyImage())")
    public void handleImage(){}

    @Before(value = "handleImage()")
    public void pressTextOnImage() throws IOException {
        logger.info("开始加水印");
        File srcFile = new File("D:/FSR.jpg");
        //通过字节输入流创建一个BufferedImage对象
        InputStream input=new FileInputStream(srcFile);
        BufferedImage srcImg= ImageIO.read(input);
        int width=srcImg.getWidth();
        int height=srcImg.getHeight();
        File destFile = new File("D:/FSR2.jpg");
        Color color = new Color(74, 181, 245);
        int size=20;
        Font font = new Font("微软雅黑",Font.BOLD,size);
        String text="by @26";
        ImageUtil.pressText(srcFile,destFile,text,color,font,(width-text.length()*size)/2,height/2-size,1.0f);
    }

    @AfterReturning("handleImage()")
    public void grayImage(){
        logger.info("开始转黑白");
        File srcFile = new File("E:/FSR.jpg");
        File destFile = new File("E:/FSR2.jpg");
        ImageUtil.gray(srcFile,destFile);
    }

}
