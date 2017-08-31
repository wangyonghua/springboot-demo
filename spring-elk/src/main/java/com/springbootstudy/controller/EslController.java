package com.springbootstudy.controller;

import com.springbootstudy.model.Cliente;
import com.springbootstudy.service.EslService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/esl/")
public class EslController {
    @Autowired
    private EslService esl;

    @RequestMapping(value = "test/{id}", method = RequestMethod.GET)
    public Cliente test(@PathVariable String id) {
        return esl.findCliente(id);
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public Cliente add() {
        Cliente cliente = new Cliente();

        cliente.setId(UUID.randomUUID().toString());
        cliente.setAccount_number(1l);
        cliente.setAddress("北京市");
        cliente.setAge(30);
        cliente.setBalance(1l);
        cliente.setCity("北京市");
        cliente.setEmail("wangyonghua@haihuilai.com");
        cliente.setEmployer("张");
        cliente.setState("1");
        return esl.addCliente(cliente);
    }
}  