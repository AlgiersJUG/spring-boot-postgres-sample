package org.jug.algeria;

import org.jug.algeria.config.JpaRepositoryConf;
import org.jug.algeria.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class DoctorBloodApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{JpaRepositoryConf.class, HomeController.class}, args);
    }
}
