package com.estranger.www;

import com.estranger.www.bean.Ball;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/5/12 21:48
 */

public class BeanPostProcessorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.estranger.www");
        Ball ball = (Ball)ctx.getBean("ball2");
        System.out.println(ball);
    }
}
