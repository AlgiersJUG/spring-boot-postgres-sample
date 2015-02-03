package org.jug.algeria;

import org.jug.algeria.controller.HomeController;
import org.jug.algeria.repository.MockUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class DoctorBloodApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{MockUserRepository.class, HomeController.class}, args);
    }
}
