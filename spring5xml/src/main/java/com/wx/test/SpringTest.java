package com.wx.test;

import com.wx.bean.User;
import org.junit.Test;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 创建时间：2020.3.29
 *
 * spring ioc 创建的方式
 *
 * spring 扫盲：
 *     ioc容器的创建方式：
 *         1.加载xml文件方式,ClassPathXMLApplicationContext
 *         2.注解方式，AnnotationConfigApplictionContex
 *         3.加载文件目录方式 FileSystemApllicationContext
 *         4.spring boot 加载方式 EmbeddedWebApplicationContext （加载ioc和启动tomcat）
 */

/**
 * 创建时间：2020.3.29
 *
 * xml 标签属性 转换成beandefinition对象的过程
 *
 * ioc xml方式创建容器 源码解读：
 *     1. 解析xml文件： 传统标签解析 ；自定义标签解析
 *     2. 通过xml头的url地址找到spring.handlers对应的自定义标签解析器类
 *           自定义标签解析器类各自的调用init方法来初始化各自自定义标签解析类
 *           自定义标签解析类调用parse方法,解析标签，
 *           扫描.class文件有没有 @Service @Component  默认filter过滤器
 *     3.把满足条件的.class转换成beandefinition对象
 *
 */
public class SpringTest {

    @Test
    public void test(){
        /**
         * spring注解方式初始化对象
         */
//        AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext("com.wx");
//        for (int i=0;i<acc.getBeanDefinitionNames().length;i++ ){
//            System.out.println(acc.getBeanDefinitionNames()[i]);
//        }
//        User user = (User)acc.getBean("user");
//        System.out.println(user.getName());

        /**
         * spring xml方式初始化对象
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
        User user1 = (User)applicationContext.getBean("user");
        System.out.println(user1.getName());


        /**
         *文件路径的加载xml文件 初始化对象
         */
//        FileSystemXmlApplicationContext fsx =  new FileSystemXmlApplicationContext("I:\\spring5.1.3\\spring-test2\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        User user2 = (User)applicationContext.getBean("user");
//        System.out.println(user2.getName());

        /**
         * springboot上下文 初始化对象 在加载 启动tomcat  需要导入springboot
         */
         //new EmbeddedWebApplicationContext();
    }

}
