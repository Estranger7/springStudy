package com.estranger.www;

import com.estranger.www.bean.Cat;
import com.estranger.www.bean.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/5/12 21:48
 */

public class BeanDefinitionRegistryPostProcessorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.estranger.www");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
    }
}
