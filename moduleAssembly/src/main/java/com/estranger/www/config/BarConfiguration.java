package com.estranger.www.config;

import com.estranger.www.bean.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/2 22:48
 */
@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar1(){
        return new Bar();
    }
}
