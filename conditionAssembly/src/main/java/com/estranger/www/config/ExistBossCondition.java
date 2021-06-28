package com.estranger.www.config;


import com.estranger.www.bean.Boss;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/7 22:05
 */
public class ExistBossCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return context.getBeanFactory().containsBeanDefinition(Boss.class.getName());
    }

    BeanDefinition
}
