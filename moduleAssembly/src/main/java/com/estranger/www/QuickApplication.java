package com.estranger.www;

import com.estranger.www.bean.Bartender;
import com.estranger.www.processor.TavernConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/2 21:49
 */
public class QuickApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        //老板
//        Boss boss = ctx.getBean(Boss.class);
//        System.out.println(boss);

        //调酒师
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("-------------------");
        Map<String, Bartender> bartenderMap = ctx.getBeansOfType(Bartender.class);
        bartenderMap.forEach((name,bartender) -> System.out.println(bartender));

        //吧台
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
