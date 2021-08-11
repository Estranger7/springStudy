package com.estranger.www.two.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.estranger.www.two.annotation.ConditionalOnClassName;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/8/11 20:46
 */
@Configuration
@ConditionalOnClassName("org.h2.Driver")
public class H2JdbcConfiguration extends AbstractJdbcConfiguration {

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl(environment.getProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
        return dataSource;
    }

}
