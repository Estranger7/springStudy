package com.estranger.www.config;

import com.estranger.www.bean.Dog;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/7/5 21:07
 */
@Component
public class DogRegisterPostProcessor implements BeanDefinitionRegistryPostProcessor{

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        System.out.println("DogRegisterPostProcessor postProcessBeanDefinitionRegistry执行了......");
        BeanDefinition dogBeanDefinition = BeanDefinitionBuilder.genericBeanDefinition(Dog.class).getBeanDefinition();
        beanDefinitionRegistry.registerBeanDefinition("dog",dogBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("DogRegisterPostProcessor postProcessBeanFactory执行了......");
    }
}
