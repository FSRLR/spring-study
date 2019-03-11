package com.spring.image;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class Qrcode {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
        // 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
        Color foreColor=new Color(238, 118, 33);
        Color bgColor=new Color(197, 193, 170);
        int foreColorRGB=foreColor.getRGB();
        int bgColorRGB=bgColor.getRGB();
        // 设置前景色
        config.setForeColor(foreColorRGB);
        // 设置背景色
        config.setBackColor(bgColorRGB);
        config.setImg("e:/jianshu.jpg");
        // 生成二维码到文件，也可以到流
        QrCodeUtil.generate("https://www.jianshu.com/u/32f964ed1fbc", config, FileUtil.file("e:/qrcode.jpg"));
    }
}
