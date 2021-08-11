package com.estranger.www;

import com.estranger.www.bean.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/8/10 20:52
 */
public class ProgramApplication {

    /**
     *  不使用任何配置类/配置文件，向IOC容器注册一个Person对象，并注入属性值
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        BeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(Person.class).getBeanDefinition();
        beanDefinition.getPropertyValues().add("name","mct");
        ctx.registerBeanDefinition("person",beanDefinition);
        //添加完BeanDefinition后，需要手动刷新容器
        ctx.refresh();

        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }
}
