package com.estranger.www.config;

import com.estranger.www.bean.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by：Estranger
 * Description：配置类
 * Date：2021/5/24 20:29
 */
@Configuration
@ComponentScan("com.estranger.www.bean")
public class QuickConfiguration {


    @Bean
    public Animal animal(){
        return new Animal();
    }
}
