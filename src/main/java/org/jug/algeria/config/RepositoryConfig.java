package org.jug.algeria.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "org.jug.algeria.repository")
@EnableAutoConfiguration
@EntityScan(basePackages = {"org.jug.algeria.domain"})
public class RepositoryConfig {
}
