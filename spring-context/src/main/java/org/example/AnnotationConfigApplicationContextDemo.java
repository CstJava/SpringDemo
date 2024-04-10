package org.example;

import org.example.bean.MyBean;
import org.example.bean.MyBeanTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ApplicationContext 是一个高级工厂接口，IOC容器，维护不同bean和其依赖关系，通过注解或者xml配置bean
 *
 * AnnotationConfigApplicationContext 基于注解的方式注入bean
 */
public class AnnotationConfigApplicationContextDemo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBean.getId());

    }

}
