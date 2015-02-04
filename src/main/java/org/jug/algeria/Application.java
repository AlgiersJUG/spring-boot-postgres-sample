package org.jug.algeria;

import org.jug.algeria.config.AppConfig;
import org.jug.algeria.server.ServletContainerCustomizer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(new Object[]{AppConfig.class, ServletContainerCustomizer.class}, args);
    }
}
