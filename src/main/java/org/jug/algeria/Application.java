package org.jug.algeria;

import org.jug.algeria.config.ServletContainerCustomizer;
import org.jug.algeria.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(new Object[]{ServletContainerCustomizer.class, HomeController.class}, args);
    }
}
