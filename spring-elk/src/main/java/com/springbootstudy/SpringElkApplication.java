package com.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication(scanBasePackages = {"com.springbootstudy"})
//@EnableElasticsearchRepositories(basePackages = {"com.springbootstudy.dao"})
public class SpringElkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringElkApplication.class, args);
    }
}
