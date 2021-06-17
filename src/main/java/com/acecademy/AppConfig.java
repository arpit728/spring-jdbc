package com.acecademy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.acecademy.dao")
public class AppConfig {

    @Bean("dataSource")
    DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/acecademy", "root", "123456789");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }

    @Bean("jdbcTemplate")
    JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
