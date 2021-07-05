package com.estranger.www.processor;

import com.estranger.www.bean.Cat;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/28 20:32
 */
@Component
public class AnimalBeanPostProcessor implements BeanPostProcessor{

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("拦截到Bean的初始化之前：" + beanName);
        if(bean instanceof Cat){
            Cat cat =  (Cat)bean;
            System.out.println("初始化之前，cat的name为：" + cat.getName());
            cat.setName("张三");
        }
        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Cat){
            Cat cat = (Cat)bean;
            System.out.println("初始化之后，cat的name为：" + cat.getName());
        }
        return bean;
    }
}
