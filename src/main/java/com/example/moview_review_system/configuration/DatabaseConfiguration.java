package com.example.moview_review_system.configuration;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.jackson2.Jackson2Plugin;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource driverManagerDataSource() {
        return new DriverManagerDataSource();
    }

    @Bean
    public Jdbi provideJdbi(DataSource dataSource) {
        TransactionAwareDataSourceProxy proxy = new TransactionAwareDataSourceProxy(dataSource);
        return Jdbi.create(proxy)
                .installPlugin(new SqlObjectPlugin())
                .installPlugin(new Jackson2Plugin());
    }
}
