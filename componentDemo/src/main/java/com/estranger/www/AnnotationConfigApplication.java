package com.estranger.www;

import com.estranger.www.factory.bean.Toy;
import com.estranger.www.factory.config.FactoryConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/5/12 21:48
 */

public class AnnotationConfigApplication {
    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(QuickConfiguration.class);
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Stream.of(beanNames).forEach(System.out::println);


        ApplicationContext ctx = new AnnotationConfigApplicationContext(FactoryConfig.class);
        Toy toy = ctx.getBean(Toy.class);
        System.out.println(toy);


    }
}
