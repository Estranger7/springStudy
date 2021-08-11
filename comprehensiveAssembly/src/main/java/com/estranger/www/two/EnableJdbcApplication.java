package com.estranger.www.two;

import com.alibaba.druid.pool.DruidDataSource;
import com.estranger.www.two.annotation.EnableJdbc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/8/11 20:58
 */
@Configuration
@EnableJdbc
@PropertySource("enablejdbc/jdbc.properties")
public class EnableJdbcApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EnableJdbcApplication.class);
        DruidDataSource dataSource = ctx.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }
}
