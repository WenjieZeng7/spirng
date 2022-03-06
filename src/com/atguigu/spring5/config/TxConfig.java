package com.atguigu.spring5.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-02-28 13:56
 */
//@Configuration
@ComponentScan(basePackages = "com.atguigu")
@EnableTransactionManagement
public class TxConfig {
    //创建数据库连接池
    @Bean
    public DruidDataSource getDruidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///user_db?characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("abc123");
        return dataSource;
    }
    //创建 JdbcTemplate 对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        //到 ioc 容器中根据类型找到 dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //注入 dataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
    //创建事务管理器
    @Bean
    public DataSourceTransactionManager
    getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new
                DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    } }
