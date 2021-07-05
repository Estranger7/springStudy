package com.estranger.www.processor;

import com.estranger.www.bean.Ball;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by：Estranger
 * Description：试验postProcessBeforeInstantiation方法能否拦截bean的创建
 * Date：2021/6/28 21:21
 */
@Component
public class BallFactoryInstantiationProcessor implements InstantiationAwareBeanPostProcessor{

    /**
     * 拦截Ball的创建，如果打印的是“香蕉球”，说明bean创建被拦截成功
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Nullable
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(Objects.equals(beanName,"ball")){
            Ball ball = new Ball();
            ball.setId("香蕉球");
            return ball;
        }
        return null;
    }


    /**
     * 拦截ball2的创建，给它的id属性进行赋值
     * @param pvs
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Nullable
    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if(Objects.equals(beanName,"ball2")){
            MutablePropertyValues values = new MutablePropertyValues(pvs);
            values.addPropertyValue("id", "拦截球");
            return values;
        }
        return null;
    }
}
