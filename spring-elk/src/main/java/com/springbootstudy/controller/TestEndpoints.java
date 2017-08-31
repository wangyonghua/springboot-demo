package com.springbootstudy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestEndpoints {
    private final static Logger logger = LoggerFactory.getLogger(TestEndpoints.class);

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id) {
        String data = "{\"name\":\"李东\"}";
        logger.info(data);
        return "product id : " + id;
    }

    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable String id) {

        return "order id : " + id;

    }
}