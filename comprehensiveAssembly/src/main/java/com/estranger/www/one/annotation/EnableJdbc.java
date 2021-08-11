package com.estranger.www.one.annotation;

import com.estranger.www.one.configuration.JdbcConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/8/11 20:47
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(JdbcConfiguration.class)
public @interface EnableJdbc{

}
