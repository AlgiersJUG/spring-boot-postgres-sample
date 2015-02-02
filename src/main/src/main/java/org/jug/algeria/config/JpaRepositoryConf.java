package org.jug.algeria.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = {"org.jug.algeria.repository"})
@EnableTransactionManagement
@PropertySource(value = "classpath*:db/postgres.properties")
public class JpaRepositoryConf {

    @Value(value = "spring.jpa.database")
    private String database;

    @Value(value = "spring.jpa.show-sql")
    private String showSql;

    @Value(value = "spring.database.driverClassName")
    private String driverClassName;

    @Value(value = "spring.datasource.password")
    private String password;

    @Value(value = "spring.datasource.url")
    private String url;

    @Value(value = "spring.datasource.username")
    private String username;

    @Value(value = "spring.jpa.hibernate.ddl-auto")
    private boolean ddlAuto;

    @Bean
    public DataSource dataSource(){
        final DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(driverClassName);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }

    @Bean
    public PlatformTransactionManager tx() {
        return new DataSourceTransactionManager(dataSource());
    }
}
