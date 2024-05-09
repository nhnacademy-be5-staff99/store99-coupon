package com.nhnacademy.store99.coupon.config;

import com.nhnacademy.store99.coupon.config.property.DataSourceProperties;
import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * DataSource 설정
 *
 * @author seunggyu-kim
 */
@RequiredArgsConstructor
@Configuration
public class DataSourceConfig {
    private final DataSourceProperties dataSourceProperties;

    /**
     * DataSource 설정
     *
     * @return DataSource
     */
    @Bean
    public DataSource dataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        basicDataSource.setUrl(dataSourceProperties.getUrl());
        basicDataSource.setUsername(dataSourceProperties.getUsername());
        basicDataSource.setPassword(dataSourceProperties.getPassword());
        basicDataSource.setInitialSize(dataSourceProperties.getInitialSize());
        basicDataSource.setMaxTotal(dataSourceProperties.getMaxTotal());
        basicDataSource.setMaxIdle(dataSourceProperties.getMaxIdle());
        basicDataSource.setMinIdle(dataSourceProperties.getMinIdle());
        basicDataSource.setMaxWaitMillis(dataSourceProperties.getMaxWaitMillis());
        basicDataSource.setValidationQuery(dataSourceProperties.getValidationQuery());
        basicDataSource.setTestOnBorrow(dataSourceProperties.isTestOnBorrow());
        return basicDataSource;
    }
}
