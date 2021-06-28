package com.estranger.www.config;

import com.estranger.www.aop.ConditionalOnBean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/7 22:26
 */
public class OnBeanCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //获取自定义注解上的beanNames集合
        String[] beanNames = (String[])metadata.getAnnotationAttributes(ConditionalOnBean.class.getName()).get("beanNames");
        //逐个校验容器中是否有这个bean
        for (String beanName:beanNames){
            if(context.getBeanFactory().containsBeanDefinition(beanName)){
                return true;
            }
        }
        return false;
    }
}
