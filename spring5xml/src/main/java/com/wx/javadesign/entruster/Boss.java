package com.wx.javadesign.entruster;

public class Boss implements Company{

    Sun sun = new Sun();

    /**
     * 公司老板  委托sun公司生成 java15
     *
     * 委托者模式 精髓是 专人做专事
     *
     */
    @Override
    public void factory() {
        sun.factory();
    }
}
