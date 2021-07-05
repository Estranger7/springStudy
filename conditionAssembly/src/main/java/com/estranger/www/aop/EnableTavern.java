package com.estranger.www.aop;

import com.estranger.www.bean.Boss;
import com.estranger.www.processor.BarConfiguration;
import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/2 21:50
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class,BarConfiguration.class})
public @interface EnableTavern {

}
