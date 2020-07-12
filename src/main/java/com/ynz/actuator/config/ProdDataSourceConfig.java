package com.ynz.actuator.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("prod")
public class ProdDataSourceConfig {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://balarama.db.elephantsql.com:5432/qfeuejep");
        dataSourceBuilder.username("qfeuejep");
        dataSourceBuilder.password("50tWaS4b2h73I4zJxu3dKTTiCh-GHfJ6");
        return dataSourceBuilder.build();
    }
}
