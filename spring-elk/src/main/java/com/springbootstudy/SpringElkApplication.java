package com.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.springbootstudy"})
public class SpringElkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringElkApplication.class, args);
    }
}
