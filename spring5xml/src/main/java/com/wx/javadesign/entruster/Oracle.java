package com.wx.javadesign.entruster;

public class Oracle implements Company {

    @Override
    public void factory() {
        System.out.println("生产 oracle 数据库");
    }
}
