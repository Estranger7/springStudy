package com.estranger.www.factory.config;

import com.estranger.www.factory.ToyFactoryBean;
import com.estranger.www.factory.bean.Child;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/5/24 21:37
 */
@Configuration
public class FactoryConfig {

    @Bean
    public Child child(){
        return new Child();
    }

    @Bean
    public ToyFactoryBean toyFactoryBean(){
        ToyFactoryBean toyFactoryBean = new ToyFactoryBean();
        toyFactoryBean.setChild(child());
        return toyFactoryBean;
    }
}
