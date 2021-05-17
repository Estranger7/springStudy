package com.estranger.dl;

import com.estranger.dl.basic_dl.bean.Dog;
import com.estranger.dl.basic_dl.dao.DogDemo;
import com.estranger.dl.oftype.dao.TypeDemo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/5/12 21:48
 */
public class QuickstartByNameApplication {
    public static void main(String[] args) {
        //根据beanName获取dog
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
        Dog dog = (Dog) beanFactory.getBean("dog");
        System.out.println(dog);

        //根据type获取DogDemo
        DogDemo dogDemo = beanFactory.getBean(DogDemo.class);
        System.out.println(dogDemo.findAll());


        //ofType  ApplicationContext是BeanFactory的子接口
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-oftype.xml");
        Map<String, TypeDemo> beans = ctx.getBeansOfType(TypeDemo.class);
        beans.forEach((beanName,bean) ->{
            System.out.println(beanName + ":" + bean.toString());
        });

        TypeDemo mysqlDemo = beans.get("mysqlDemo");
        mysqlDemo.print();
    }
}
