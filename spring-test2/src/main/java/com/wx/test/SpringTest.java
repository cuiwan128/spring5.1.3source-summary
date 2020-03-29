package com.wx.test;

import com.wx.bean.User;
import org.junit.Test;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest {

    @Test
    public void test(){
        /**
         * spring注解方式初始化对象
         */
        AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext("com.wx");
        for (int i=0;i<acc.getBeanDefinitionNames().length;i++ ){
            System.out.println(acc.getBeanDefinitionNames()[i]);
        }
        User user = (User)acc.getBean("user");
        System.out.println(user.getName());

        /**
         * spring xml方式初始化对象
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
        User user1 = (User)applicationContext.getBean("user");
        System.out.println(user1.getName());


        /**
         *文件路径的加载xml文件 初始化对象
         */
        FileSystemXmlApplicationContext fsx =  new FileSystemXmlApplicationContext("I:\\spring5.1.3\\spring-test2\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        User user2 = (User)applicationContext.getBean("user");
        System.out.println(user2.getName());

        /**
         * springboot上下文 初始化对象 在加载 启动tomcat  需要导入springboot
         */
         new EmbeddedWebApplicationContext();
    }

}
