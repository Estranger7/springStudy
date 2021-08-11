package com.estranger.www.two.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.estranger.www.two.annotation.ConditionalOnClassName;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/8/11 20:46
 */
@Configuration
@ConditionalOnClassName("oracle.jdbc.driver.OracleDriver")
public class OracleJdbcConfiguration extends AbstractJdbcConfiguration{

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl(environment.getProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
        return dataSource;
    }

}
