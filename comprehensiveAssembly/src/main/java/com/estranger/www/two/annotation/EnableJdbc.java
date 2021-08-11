package com.estranger.www.two.annotation;

import com.estranger.www.two.configuration.AbstractJdbcConfiguration;
import com.estranger.www.two.configuration.H2JdbcConfiguration;
import com.estranger.www.two.selectImport.JdbcConfigSelector;
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
@Import(JdbcConfigSelector.class)
public @interface EnableJdbc{

}
