package com.estranger.www;

import com.estranger.www.bean.Red;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/5/12 21:48
 */

public class BeanFactoryPostProcessorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.estranger.www");
        Red red = ctx.getBean(Red.class);
        System.out.println(red);
    }
}
