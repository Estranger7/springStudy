package com.estranger.www.config;

import com.estranger.www.aop.ConditionalOnBean;
import com.estranger.www.bean.Bar;
import com.estranger.www.bean.Boss;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/2 22:48
 */
@Configuration
public class BarConfiguration {

    @Bean
    @Conditional(ExistBossCondition.class)
    public Bar bar2(){
        return new Bar();
    }


    @Bean
    @ConditionalOnBean(beanNames = "com.estranger.www.bean.Boss")
    public Bar bar3(){
        return new Bar();
    }
}
