package com.estranger.www.aop;

import com.estranger.www.config.OnBeanCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/7 22:25
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnBeanCondition.class)
public @interface ConditionalOnBean {

    String[] beanNames() default {};
}
