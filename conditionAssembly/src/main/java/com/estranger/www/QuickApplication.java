package com.estranger.www;

import com.estranger.www.bean.Boss;
import com.estranger.www.config.TavernConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/2 21:49
 */
public class QuickApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);


    }
}
