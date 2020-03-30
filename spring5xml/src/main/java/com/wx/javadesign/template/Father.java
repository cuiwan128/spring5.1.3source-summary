package com.wx.javadesign.template;


public abstract class Father {
    /**
     *  价值观
     *  人生的主流程
     */
    public void life(){
        A();
        B();
        love();
    }

    public void A(){
        System.out.println("学习要认真");
    }

    public void B(){
        System.out.println("要有责任担当");
    }

    /**
     * 爱情观
     * 爱情观个人不同
     * 此方法留给子类实现
     * 实现钩子方法的作用
     * 影响人生的主流程方法
     */
    public abstract void love();
}
