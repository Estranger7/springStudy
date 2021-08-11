package com.estranger.www.two.configuration;

import com.estranger.www.two.annotation.ConditionalOnClassName;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/8/11 20:54
 */
public class OnClassNameConditional implements Condition{

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //当前classpath路径下拥有@ConditionalOnClassName注解中声明的value的类的话，就返回true
        String className = (String) metadata.getAnnotationAttributes(ConditionalOnClassName.class.getName()).get("value");
        try{
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
