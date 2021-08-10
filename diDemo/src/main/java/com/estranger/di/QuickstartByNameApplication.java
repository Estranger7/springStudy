package com.estranger.di;

import com.estranger.di.bean.Animal;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/5/12 21:48
 */
public class QuickstartByNameApplication {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");
        Animal animal = beanFactory.getBean(Animal.class);
        System.out.println(animal);
    }
}
