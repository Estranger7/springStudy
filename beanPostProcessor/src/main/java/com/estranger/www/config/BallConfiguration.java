package com.estranger.www.config;

import com.estranger.www.bean.Ball;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/28 21:22
 */
@Configuration
public class BallConfiguration {

    @Bean
    public Ball ball(){
        Ball ball = new Ball();
        ball.setId("1234");
        return ball;
    }

    @Bean
    public Ball ball2(){
        return new Ball();
    }
}
