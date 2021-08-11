package com.estranger.www.two.annotation;

import com.estranger.www.two.configuration.OnClassNameConditional;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/8/11 20:47
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnClassNameConditional.class)
public @interface ConditionalOnClassName {

    String value();
}
