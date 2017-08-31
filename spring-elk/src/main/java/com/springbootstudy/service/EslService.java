package com.springbootstudy.service;

import com.springbootstudy.model.Cliente;

public interface EslService {
    Cliente findCliente(String id);

    Cliente addCliente(Cliente cliente);
}  