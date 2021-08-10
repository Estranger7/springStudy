package com.estranger.www.config;

import com.estranger.www.bean.Color;
import com.estranger.www.bean.Red;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.util.stream.Stream;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/7/5 20:35
 */
@Component
public class ColorNameSetterFactoryPostProcessor implements BeanFactoryPostProcessor{

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("red");
        if(ClassUtils.resolveClassName(beanDefinition.getBeanClassName(),this.getClass().getClassLoader()).equals(Red.class)) {
            beanDefinition.getPropertyValues().add("name", "red");
        }



//        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(beanName ->{
//            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
//            if (StringUtils.hasText(beanDefinition.getBeanClassName())) {
//                if (ClassUtils.resolveClassName(beanDefinition.getBeanClassName(),this.getClass().getClassLoader()).getSuperclass().equals(Color.class)) {
//                    beanDefinition.getPropertyValues().add("name",beanName);
//                }
//            }
//        });

    }
}
