package com.estranger.www.one;

import com.alibaba.druid.pool.DruidDataSource;
import com.estranger.www.one.annotation.EnableJdbc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/8/11 20:58
 */
@Configuration
@EnableJdbc
public class EnableJdbcApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EnableJdbcApplication.class);
        DruidDataSource dataSource = ctx.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }
}
