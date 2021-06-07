package com.estranger.www.config;

import com.estranger.www.bean.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/2 22:27
 */
@Configuration
public class BartenderConfiguration {

    @Bean
    public Bartender zhangsan(){
        return new Bartender("张三");
    }

    @Bean
    public Bartender lisi(){
        return new Bartender("李四");
    }
}
