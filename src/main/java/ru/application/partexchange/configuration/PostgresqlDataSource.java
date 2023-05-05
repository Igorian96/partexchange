package ru.application.partexchange.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PostgresqlDataSource {

    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource inputDataSourceProperties() {
        return DataSourceBuilder
                .create()
                .build();
    }
}