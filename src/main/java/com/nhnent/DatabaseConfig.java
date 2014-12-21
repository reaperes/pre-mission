package com.nhnent;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.nhnent.persistence")
public class DatabaseConfig {
    @Bean
    public DataSource dataSource() {
        return new PooledDataSource("com.apache.ibatis.datasource.pooled.PooledDataSource",
                "jdbc:mysql://localhost:3306/PreMission", "next", "next!!@@##$$");
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());
        return sqlSessionFactory.getObject();
    }
}