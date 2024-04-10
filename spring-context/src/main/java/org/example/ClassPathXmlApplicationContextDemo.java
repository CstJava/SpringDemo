package org.example;

import org.example.bean.MyBean;
import org.example.bean.MyBeanTwo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContext 是一个高级工厂接口，IOC容器，维护不同bean和其依赖关系，通过注解或者xml配置bean
 *
 * ClassPathXmlApplicationContext 基于xml的方式注入bean
 */
public class ClassPathXmlApplicationContextDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBean.getId());

        MyBeanTwo myBeanTwo = (MyBeanTwo) applicationContext.getBean("myBeanTwo");
        System.out.println(myBeanTwo.getName());

        BeanFactory beanFactory = applicationContext.getBeanFactory();
        Object bean = beanFactory.getBean("myBeanTwo");
        System.out.println(String.valueOf((bean instanceof MyBean)));

        Class<?> beanType = beanFactory.getType("myBeanTwo");
        System.out.println(String.valueOf(beanType));
    }

}
